/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.ULong;


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
public interface IProcesslist extends Serializable {

	/**
	 * Setter for <code>information_schema.PROCESSLIST.ID</code>.
	 */
	public void setId(ULong value);

	/**
	 * Getter for <code>information_schema.PROCESSLIST.ID</code>.
	 */
	public ULong getId();

	/**
	 * Setter for <code>information_schema.PROCESSLIST.USER</code>.
	 */
	public void setUser(String value);

	/**
	 * Getter for <code>information_schema.PROCESSLIST.USER</code>.
	 */
	public String getUser();

	/**
	 * Setter for <code>information_schema.PROCESSLIST.HOST</code>.
	 */
	public void setHost(String value);

	/**
	 * Getter for <code>information_schema.PROCESSLIST.HOST</code>.
	 */
	public String getHost();

	/**
	 * Setter for <code>information_schema.PROCESSLIST.DB</code>.
	 */
	public void setDb(String value);

	/**
	 * Getter for <code>information_schema.PROCESSLIST.DB</code>.
	 */
	public String getDb();

	/**
	 * Setter for <code>information_schema.PROCESSLIST.COMMAND</code>.
	 */
	public void setCommand(String value);

	/**
	 * Getter for <code>information_schema.PROCESSLIST.COMMAND</code>.
	 */
	public String getCommand();

	/**
	 * Setter for <code>information_schema.PROCESSLIST.TIME</code>.
	 */
	public void setTime(Integer value);

	/**
	 * Getter for <code>information_schema.PROCESSLIST.TIME</code>.
	 */
	public Integer getTime();

	/**
	 * Setter for <code>information_schema.PROCESSLIST.STATE</code>.
	 */
	public void setState(String value);

	/**
	 * Getter for <code>information_schema.PROCESSLIST.STATE</code>.
	 */
	public String getState();

	/**
	 * Setter for <code>information_schema.PROCESSLIST.INFO</code>.
	 */
	public void setInfo(String value);

	/**
	 * Getter for <code>information_schema.PROCESSLIST.INFO</code>.
	 */
	public String getInfo();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IProcesslist
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IProcesslist from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IProcesslist
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IProcesslist> E into(E into);
}
