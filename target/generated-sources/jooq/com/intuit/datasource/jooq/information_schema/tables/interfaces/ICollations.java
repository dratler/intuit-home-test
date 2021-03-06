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
public interface ICollations extends Serializable {

	/**
	 * Setter for <code>information_schema.COLLATIONS.COLLATION_NAME</code>.
	 */
	public void setCollationName(String value);

	/**
	 * Getter for <code>information_schema.COLLATIONS.COLLATION_NAME</code>.
	 */
	public String getCollationName();

	/**
	 * Setter for <code>information_schema.COLLATIONS.CHARACTER_SET_NAME</code>.
	 */
	public void setCharacterSetName(String value);

	/**
	 * Getter for <code>information_schema.COLLATIONS.CHARACTER_SET_NAME</code>.
	 */
	public String getCharacterSetName();

	/**
	 * Setter for <code>information_schema.COLLATIONS.ID</code>.
	 */
	public void setId(Long value);

	/**
	 * Getter for <code>information_schema.COLLATIONS.ID</code>.
	 */
	public Long getId();

	/**
	 * Setter for <code>information_schema.COLLATIONS.IS_DEFAULT</code>.
	 */
	public void setIsDefault(String value);

	/**
	 * Getter for <code>information_schema.COLLATIONS.IS_DEFAULT</code>.
	 */
	public String getIsDefault();

	/**
	 * Setter for <code>information_schema.COLLATIONS.IS_COMPILED</code>.
	 */
	public void setIsCompiled(String value);

	/**
	 * Getter for <code>information_schema.COLLATIONS.IS_COMPILED</code>.
	 */
	public String getIsCompiled();

	/**
	 * Setter for <code>information_schema.COLLATIONS.SORTLEN</code>.
	 */
	public void setSortlen(Long value);

	/**
	 * Getter for <code>information_schema.COLLATIONS.SORTLEN</code>.
	 */
	public Long getSortlen();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ICollations
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.ICollations from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ICollations
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.ICollations> E into(E into);
}
