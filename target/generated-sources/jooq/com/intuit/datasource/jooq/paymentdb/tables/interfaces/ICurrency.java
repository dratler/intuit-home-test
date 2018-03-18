/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.paymentdb.tables.interfaces;


import java.io.Serializable;

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
public interface ICurrency extends Serializable {

	/**
	 * Setter for <code>paymentdb.currency.id</code>.
	 */
	public void setId(UInteger value);

	/**
	 * Getter for <code>paymentdb.currency.id</code>.
	 */
	public UInteger getId();

	/**
	 * Setter for <code>paymentdb.currency.short_name</code>.
	 */
	public void setShortName(String value);

	/**
	 * Getter for <code>paymentdb.currency.short_name</code>.
	 */
	public String getShortName();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ICurrency
	 */
	public void from(com.intuit.datasource.jooq.paymentdb.tables.interfaces.ICurrency from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ICurrency
	 */
	public <E extends com.intuit.datasource.jooq.paymentdb.tables.interfaces.ICurrency> E into(E into);
}