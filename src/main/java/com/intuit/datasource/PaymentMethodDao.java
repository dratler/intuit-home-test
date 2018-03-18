package com.intuit.datasource;

import com.google.inject.Inject;
import com.intuit.model.PaymentMethod;
import org.jooq.DSLContext;

import java.util.List;
import java.util.Objects;

import static com.intuit.datasource.jooq.paymentdb.tables.PaymentMethods.PAYMENT_METHODS;

public class PaymentMethodDao {
    @Inject
    private DSLContext dsl;

    public List<PaymentMethod> getAll(){
        return dsl.selectFrom(PAYMENT_METHODS).fetchInto(PaymentMethod.class);
    }

    public PaymentMethod findByGuid(String guid) throws Exception {
        PaymentMethod pm = dsl.selectFrom(PAYMENT_METHODS).where(PAYMENT_METHODS.NAME.eq(guid)).fetchOneInto(PaymentMethod.class);
        if(Objects.isNull(pm)){
            throw new Exception("Requested ("+guid+") Payment Method is not found ");
        }
        return pm;
    }
}
