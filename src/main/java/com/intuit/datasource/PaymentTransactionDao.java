package com.intuit.datasource;

import com.intuit.datasource.jooq.paymentdb.tables.pojos.PaymentTransaction;
import com.intuit.datasource.jooq.paymentdb.tables.records.PaymentTransactionRecord;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import javax.inject.Inject;
import java.util.List;

import static com.intuit.datasource.jooq.paymentdb.tables.PaymentTransaction.PAYMENT_TRANSACTION;

public class PaymentTransactionDao {

    @Inject private DSLContext dsl;

    public void store(PaymentTransaction transaction, double approvalePercentage) {
        dsl.transaction(config ->{
            DSLContext ctx = DSL.using(config);
            List<Risk> query = ctx.select(DSL.count(PAYMENT_TRANSACTION.ID),PAYMENT_TRANSACTION.IS_TRANSACTION_APPROVED)
                .from(PAYMENT_TRANSACTION)
                .groupBy(PAYMENT_TRANSACTION.IS_TRANSACTION_APPROVED)
                .fetchInto(Risk.class);
            int appoved = query.stream().filter(c -> c.isApproved).toArray().length;
            int rejected = query.stream().filter(c -> !c.isApproved).toArray().length;
            int total = (appoved+rejected)%rejected;
            //FIXME - the calc is not good!!!!
            Byte b = (total <= approvalePercentage) ? Byte.valueOf("1") : Byte.valueOf("0");
            transaction.setIsTransactionApproved(b);
            PaymentTransactionRecord record = ctx.newRecord(PAYMENT_TRANSACTION,transaction);
            record.store();
            }
        );
    }
}

class Risk{
    public int count;
    public boolean isApproved;
}
