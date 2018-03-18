package com.intuit.controller;





//import kakfa_clj.core.BrokerConf;
//import kakfa_clj.core.Producer;

import com.google.gson.Gson;
import com.intuit.model.Payment;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import javax.inject.Inject;
import java.util.Objects;

public class PaymentController {

    @Inject
    private Producer producer;

    @Inject private UserController user;
    @Inject private CurrencyController currency;
    @Inject private PayeeController payee;
    @Inject private PaymentMethodController paymentMethod;
    @Inject private Gson gson;



    public void sendToQueue(Payment payment)  {

        producer.send(new ProducerRecord<String, String>("payment-topic", gson.toJson(payment)));

    }

    public void validEntry(Payment payment) throws Exception {
        if (Objects.isNull(payment)) {
            throw new Exception("Payment is null");
        }
        if(Objects.isNull(payment.amount) || 0 > payment.amount){
            throw new Exception("Given Amount is null or negative");
        }
        user.findUserByGuid(payment.userId);
        currency.findByValue(payment.currency);
        payee.findByGuid(payment.payeeId);
        paymentMethod.findByGuid(payment.paymentMethodId);
    }

    public void store(Payment payment){

    }
}
