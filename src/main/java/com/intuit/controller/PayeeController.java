package com.intuit.controller;

import com.google.inject.Inject;
import com.intuit.datasource.PayeeDAO;
import com.intuit.model.Payee;

import java.util.List;
import java.util.Objects;

public class PayeeController {

    @Inject
    private PayeeDAO payeeDAO;

    public List<Payee> getPayee(){
        return payeeDAO.getAll();
    }


    public Payee findByGuid(String payeeId) throws Exception {
        if(Objects.isNull(payeeId)){
            throw new Exception("Sending Null Value is forbidden to get Payee");
        }
        return payeeDAO.findByGuid(payeeId);
    }
}
