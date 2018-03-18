package com.intuit.datasource;

import com.google.inject.Inject;
import com.intuit.datasource.jooq.paymentdb.tables.pojos.Currency;
import org.jooq.DSLContext;

import java.util.Objects;

import static com.intuit.datasource.jooq.paymentdb.tables.Currency.CURRENCY;

public class CurrencyDao {

    @Inject
    private DSLContext dsl;

    public Currency findByValue(String name) throws Exception {
        Currency currency = dsl.selectFrom(CURRENCY).where(CURRENCY.SHORT_NAME.eq(name)).fetchOneInto(Currency.class);
        if(Objects.isNull(currency)){
            throw new Exception("Requested ("+name+") currency not supported");
        }
        return currency;
    }
}
