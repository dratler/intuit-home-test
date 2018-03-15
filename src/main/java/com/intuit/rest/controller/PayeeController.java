package com.intuit.rest.controller;

import com.intuit.rest.model.Payee;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Singleton
public class PayeeController {

    private List<Payee> payees;

    public List<Payee> getPayee(){
        //TODO - wire this controller with datasource
        this.payees = generateMockData();
        return payees;
    }

    private List<Payee> generateMockData(){
        List<Payee> payees= new ArrayList<Payee>();
        for(int i = 0 ; i < 10 ; i++){
            payees.add(new Payee(UUID.randomUUID().toString(),"payee-"+i));
        }
        return payees;
    }

}
