/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.paymentdb.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IPaymentTransaction extends Serializable {

	/**
	 * Setter for <code>paymentdb.payment_transaction.id</code>.
	 */
	public void setId(UInteger value);

	/**
	 * Getter for <code>paymentdb.payment_transaction.id</code>.
	 */
	public UInteger getId();

	/**
	 * Setter for <code>paymentdb.payment_transaction.amount</code>.
	 */
	public void setAmount(Double value);

	/**
	 * Getter for <code>paymentdb.payment_transaction.amount</code>.
	 */
	public Double getAmount();

	/**
	 * Setter for <code>paymentdb.payment_transaction.currency</code>.
	 */
	public void setCurrency(String value);

	/**
	 * Getter for <code>paymentdb.payment_transaction.currency</code>.
	 */
	public String getCurrency();

	/**
	 * Setter for <code>paymentdb.payment_transaction.user_id</code>.
	 */
	public void setUserId(String value);

	/**
	 * Getter for <code>paymentdb.payment_transaction.user_id</code>.
	 */
	public String getUserId();

	/**
	 * Setter for <code>paymentdb.payment_transaction.payee_id</code>.
	 */
	public void setPayeeId(String value);

	/**
	 * Getter for <code>paymentdb.payment_transaction.payee_id</code>.
	 */
	public String getPayeeId();

	/**
	 * Setter for <code>paymentdb.payment_transaction.payment_method_id</code>.
	 */
	public void setPaymentMethodId(String value);

	/**
	 * Getter for <code>paymentdb.payment_transaction.payment_method_id</code>.
	 */
	public String getPaymentMethodId();

	/**
	 * Setter for <code>paymentdb.payment_transaction.is_transaction_approved</code>.
	 */
	public void setIsTransactionApproved(Byte value);

	/**
	 * Getter for <code>paymentdb.payment_transaction.is_transaction_approved</code>.
	 */
	public Byte getIsTransactionApproved();

	/**
	 * Setter for <code>paymentdb.payment_transaction.created_at</code>.
	 */
	public void setCreatedAt(Timestamp value);

	/**
	 * Getter for <code>paymentdb.payment_transaction.created_at</code>.
	 */
	public Timestamp getCreatedAt();

	/**
	 * Setter for <code>paymentdb.payment_transaction.updated_at</code>.
	 */
	public void setUpdatedAt(Timestamp value);

	/**
	 * Getter for <code>paymentdb.payment_transaction.updated_at</code>.
	 */
	public Timestamp getUpdatedAt();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IPaymentTransaction
	 */
	public void from(com.intuit.datasource.jooq.paymentdb.tables.interfaces.IPaymentTransaction from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IPaymentTransaction
	 */
	public <E extends com.intuit.datasource.jooq.paymentdb.tables.interfaces.IPaymentTransaction> E into(E into);
}
