/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


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
public interface IInnodbFtConfig extends Serializable {

	/**
	 * Setter for <code>information_schema.INNODB_FT_CONFIG.KEY</code>.
	 */
	public void setKey(String value);

	/**
	 * Getter for <code>information_schema.INNODB_FT_CONFIG.KEY</code>.
	 */
	public String getKey();

	/**
	 * Setter for <code>information_schema.INNODB_FT_CONFIG.VALUE</code>.
	 */
	public void setValue(String value);

	/**
	 * Getter for <code>information_schema.INNODB_FT_CONFIG.VALUE</code>.
	 */
	public String getValue();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IInnodbFtConfig
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbFtConfig from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IInnodbFtConfig
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbFtConfig> E into(E into);
}