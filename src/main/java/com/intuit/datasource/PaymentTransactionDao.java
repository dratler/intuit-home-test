package com.intuit.datasource;

import com.intuit.datasource.jooq.paymentdb.tables.pojos.PaymentTransaction;
import com.intuit.datasource.jooq.paymentdb.tables.records.PaymentTransactionRecord;
import org.jooq.DSLContext;

import javax.inject.Inject;

import static com.intuit.datasource.jooq.paymentdb.tables.PaymentTransaction.PAYMENT_TRANSACTION;

public class PaymentTransactionDao {

    @Inject private DSLContext dsl;

    public void store(PaymentTransaction transaction) {
        PaymentTransactionRecord record = dsl.newRecord(PAYMENT_TRANSACTION,transaction);
        record.store();
    }
}

