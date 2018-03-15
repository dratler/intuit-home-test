package com.intuit.rest.controller;

import com.intuit.rest.model.PaymentMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PaymentMethodController {
    private List<PaymentMethod> paymentMethods;

    public List<PaymentMethod> getMethods(){
        //TODO - wire this controller with datasource
        this.paymentMethods = generateMockData();
        return paymentMethods;
    }

    private List<PaymentMethod> generateMockData(){
        List<PaymentMethod> payements= new ArrayList<PaymentMethod>();
        for(int i = 0 ; i < 10 ; i++){
            payements.add(new PaymentMethod(UUID.randomUUID().toString(),"pay-method-"+i));
        }
        return payements;
    }
}
