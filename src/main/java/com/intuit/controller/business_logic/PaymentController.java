package com.intuit.controller.business_logic;

import com.intuit.controller.util.RiskEngine;
import com.intuit.datasource.PaymentTransactionDao;
import com.intuit.datasource.jooq.paymentdb.tables.pojos.PaymentTransaction;
import com.intuit.model.Payment;

import javax.inject.Inject;
import java.util.Objects;

public class PaymentController {

    @Inject private UserController user;
    @Inject private CurrencyController currency;
    @Inject private PayeeController payee;
    @Inject private PaymentMethodController paymentMethod;
    @Inject private PaymentTransactionDao dao;
    @Inject private RiskEngine riskEngine;


    public void validEntry(Payment payment) throws Exception {
        if(Objects.isNull(payment))
            throw new Exception("Payment Object is null");

        user.findUserByGuid(payment.userId);
        currency.findByValue(payment.currency);
        payee.findByGuid(payment.payeeId);
        paymentMethod.findByGuid(payment.paymentMethodId);
    }

    public void store(Payment payment) throws Exception {
        validEntry(payment);
        Byte approved = riskEngine.evaluate();
        PaymentTransaction transaction  = buildObject(payment,approved);
        dao.store(transaction);
    }

    private PaymentTransaction buildObject(Payment payment,Byte approved) {
        PaymentTransaction transaction = new PaymentTransaction();
        transaction.setAmount(payment.amount);
        transaction.setCurrency(payment.currency);
        transaction.setUserId(payment.userId);
        transaction.setPaymentMethodId(payment.paymentMethodId);
        transaction.setPayeeId(payment.payeeId);
        transaction.setIsTransactionApproved(approved);
        return transaction;
    }


}
