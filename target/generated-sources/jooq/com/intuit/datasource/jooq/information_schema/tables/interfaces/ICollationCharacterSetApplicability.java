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
public interface ICollationCharacterSetApplicability extends Serializable {

	/**
	 * Setter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
	 */
	public void setCollationName(String value);

	/**
	 * Getter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
	 */
	public String getCollationName();

	/**
	 * Setter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
	 */
	public void setCharacterSetName(String value);

	/**
	 * Getter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
	 */
	public String getCharacterSetName();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ICollationCharacterSetApplicability
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.ICollationCharacterSetApplicability from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ICollationCharacterSetApplicability
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.ICollationCharacterSetApplicability> E into(E into);
}