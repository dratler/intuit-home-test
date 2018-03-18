package com.intuit.controller;

import com.intuit.datasource.PaymentMethodDao;
import com.intuit.model.PaymentMethod;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

public class PaymentMethodController {
    @Inject private PaymentMethodDao dao;

    public List<PaymentMethod> getMethods(){
        return dao.getAll();
    }

    public PaymentMethod findByGuid(String guid) throws Exception {
        if(Objects.isNull(guid)){
            throw new Exception("Sending Null Value is forbidden to get Payment Method");
        }
        return dao.findByGuid(guid);
    }


}
