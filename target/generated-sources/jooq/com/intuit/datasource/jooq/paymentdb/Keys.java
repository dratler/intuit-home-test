/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.paymentdb;


import com.intuit.datasource.jooq.paymentdb.tables.PaymentTransaction;
import com.intuit.datasource.jooq.paymentdb.tables.records.PaymentTransactionRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.UInteger;


/**
 * A class modelling foreign key relationships between tables of the <code>paymentdb</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<PaymentTransactionRecord, UInteger> IDENTITY_PAYMENT_TRANSACTION = Identities0.IDENTITY_PAYMENT_TRANSACTION;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<PaymentTransactionRecord> KEY_PAYMENT_TRANSACTION_PRIMARY = UniqueKeys0.KEY_PAYMENT_TRANSACTION_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<PaymentTransactionRecord, UInteger> IDENTITY_PAYMENT_TRANSACTION = createIdentity(PaymentTransaction.PAYMENT_TRANSACTION, PaymentTransaction.PAYMENT_TRANSACTION.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<PaymentTransactionRecord> KEY_PAYMENT_TRANSACTION_PRIMARY = createUniqueKey(PaymentTransaction.PAYMENT_TRANSACTION, PaymentTransaction.PAYMENT_TRANSACTION.ID);
	}
}
