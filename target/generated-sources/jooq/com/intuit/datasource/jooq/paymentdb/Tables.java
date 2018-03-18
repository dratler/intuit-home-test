/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.paymentdb;


import com.intuit.datasource.jooq.paymentdb.tables.Currency;
import com.intuit.datasource.jooq.paymentdb.tables.Payee;
import com.intuit.datasource.jooq.paymentdb.tables.PaymentMethods;
import com.intuit.datasource.jooq.paymentdb.tables.PaymentTransaction;
import com.intuit.datasource.jooq.paymentdb.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in paymentdb
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table paymentdb.currency
	 */
	public static final Currency CURRENCY = com.intuit.datasource.jooq.paymentdb.tables.Currency.CURRENCY;

	/**
	 * The table paymentdb.payee
	 */
	public static final Payee PAYEE = com.intuit.datasource.jooq.paymentdb.tables.Payee.PAYEE;

	/**
	 * The table paymentdb.payment_methods
	 */
	public static final PaymentMethods PAYMENT_METHODS = com.intuit.datasource.jooq.paymentdb.tables.PaymentMethods.PAYMENT_METHODS;

	/**
	 * The table paymentdb.payment_transaction
	 */
	public static final PaymentTransaction PAYMENT_TRANSACTION = com.intuit.datasource.jooq.paymentdb.tables.PaymentTransaction.PAYMENT_TRANSACTION;

	/**
	 * The table paymentdb.user
	 */
	public static final User USER = com.intuit.datasource.jooq.paymentdb.tables.User.USER;
}