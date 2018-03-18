package com.intuit.controller;

import com.google.inject.Inject;
import com.intuit.datasource.CurrencyDao;
import com.intuit.datasource.jooq.paymentdb.tables.pojos.Currency;

import java.util.Objects;

public class CurrencyController {
    @Inject
    private CurrencyDao dao;

    public Currency findByValue(String value) throws Exception {
        if(Objects.isNull(value)){
            throw new Exception("Sending Null Value is forbidden to get Currency");
        }
        return dao.findByValue(value);
    }
}
