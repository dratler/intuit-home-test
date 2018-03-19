package com.intuit.controller;





//import kakfa_clj.core.BrokerConf;
//import kakfa_clj.core.Producer;

import com.google.gson.Gson;
import com.intuit.datasource.PaymentTransactionDao;
import com.intuit.datasource.jooq.paymentdb.tables.pojos.*;
import com.intuit.model.Payment;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import javax.inject.Inject;
import java.util.Objects;

public class PaymentController {

    @Inject private Producer producer;
    @Inject private UserController user;
    @Inject private CurrencyController currency;
    @Inject private PayeeController payee;
    @Inject private PaymentMethodController paymentMethod;
    @Inject private Gson gson;
    @Inject private PaymentTransactionDao dao;



    public void sendToQueue(Payment payment)  {
        producer.send(new ProducerRecord<String, String>("payment-topic", gson.toJson(payment)));
    }

    public void validEntry(Payment payment,boolean deep) throws Exception {
        if (Objects.isNull(payment)) {
            throw new Exception("Payment is null");
        }
        if(Objects.isNull(payment.amount) || 0 > payment.amount){
            throw new Exception("Given Amount is null or negative");
        }
        if(Objects.isNull(payment.userId)){
            throw new Exception("Payment is missing `userId`");
        }
        if(Objects.isNull(payment.currency)){
            throw new Exception("Payment is missing `currency`");
        }
        if(Objects.isNull(payment.payeeId)){
            throw new Exception("Payment is missing `payeeId`");
        }
        if(Objects.isNull(payment.paymentMethodId)){
            throw new Exception("Payment is missing `paymentMethodId`");
        }
        if(deep) {
            user.findUserByGuid(payment.userId);
            currency.findByValue(payment.currency);
            payee.findByGuid(payment.payeeId);
            paymentMethod.findByGuid(payment.paymentMethodId);
        }
    }

    public void store(Payment payment,double approvalePercentage) throws Exception {
        validEntry(payment,false);
        User u = user.findUserByGuid(payment.userId);
        Currency c = currency.findByValue(payment.currency);
        Payee p = payee.findByGuid(payment.payeeId);
        PaymentMethods pm = paymentMethod.findByGuid(payment.paymentMethodId);
        PaymentTransaction transaction  = buildObject(payment,c,u,p,pm);
        dao.store(transaction,approvalePercentage);
    }

    private PaymentTransaction buildObject(Payment payment,
                                           Currency c,
                                           User u,
                                           Payee p,
                                           PaymentMethods pm) {
        PaymentTransaction transaction = new PaymentTransaction();
        transaction.setAmount(payment.amount);
        transaction.setCId(c.getId());
        transaction.setPId(p.getId());
        transaction.setPMId(pm.getId());
        transaction.setUId(u.getId());
        return transaction;
    }


}
