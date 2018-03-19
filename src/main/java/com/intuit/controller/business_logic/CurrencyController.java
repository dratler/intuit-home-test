package com.intuit.controller.business_logic;

import com.intuit.controller.util.HttpService;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CurrencyController {

    @Inject private HttpService httpService;

    public String findByValue(String value) throws Exception {
        if(Objects.isNull(value) || 3 < value.length())
            throw new Exception("Request currency is not at right format");
        List<String> currencies = httpService.getData("currency");
        Optional<String> currency = currencies
                .stream()
                .filter(c->c.equalsIgnoreCase(value))
                .findFirst();
        if(!currency.isPresent())
            throw new Exception("Requested Currency not supported ("+value+")");
        return currency.get();
    }
}
