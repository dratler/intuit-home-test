package com.intuit.datasource;

import com.google.inject.Inject;
import com.intuit.model.Payee;
import org.jooq.DSLContext;

import java.util.List;
import java.util.Objects;

import static com.intuit.datasource.jooq.paymentdb.tables.Payee.PAYEE;

public class PayeeDAO {
    @Inject
    private DSLContext dsl;

    public List<Payee> getAll(){
        return dsl.selectFrom(PAYEE).fetchInto(Payee.class);
    }

    public Payee findByGuid(String guid) throws Exception {
        Payee payee = dsl.selectFrom(PAYEE).where(PAYEE.VALUE.eq(guid)).fetchOneInto(Payee.class);
        if(Objects.isNull(payee)){
            throw new Exception("Requested ("+guid+") Payee is not found ");
        }
        return payee;
    }
}
