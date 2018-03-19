package com.intuit.controller;

import com.google.gson.Gson;
import com.intuit.controller.business_logic.PaymentController;
import com.intuit.model.Payment;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.util.Objects;

public class EngineController {

    @Inject private Gson gson;
    @Inject private PaymentController paymentController;

    public void storePayment(String payment) throws Exception {
        if(Objects.isNull(payment) || StringUtils.isEmpty(payment)){
            throw new Exception("Payment is null or empty and will not be stored");
        }
        Payment p = convert(payment);
        paymentController.validEntry(p);
        paymentController.store(p);
    }

    private Payment convert(String paymentStr){
        return gson.fromJson(paymentStr,Payment.class);
    }
}
