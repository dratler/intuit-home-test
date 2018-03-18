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
public interface ISchemata extends Serializable {

	/**
	 * Setter for <code>information_schema.SCHEMATA.CATALOG_NAME</code>.
	 */
	public void setCatalogName(String value);

	/**
	 * Getter for <code>information_schema.SCHEMATA.CATALOG_NAME</code>.
	 */
	public String getCatalogName();

	/**
	 * Setter for <code>information_schema.SCHEMATA.SCHEMA_NAME</code>.
	 */
	public void setSchemaName(String value);

	/**
	 * Getter for <code>information_schema.SCHEMATA.SCHEMA_NAME</code>.
	 */
	public String getSchemaName();

	/**
	 * Setter for <code>information_schema.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
	 */
	public void setDefaultCharacterSetName(String value);

	/**
	 * Getter for <code>information_schema.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
	 */
	public String getDefaultCharacterSetName();

	/**
	 * Setter for <code>information_schema.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
	 */
	public void setDefaultCollationName(String value);

	/**
	 * Getter for <code>information_schema.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
	 */
	public String getDefaultCollationName();

	/**
	 * Setter for <code>information_schema.SCHEMATA.SQL_PATH</code>.
	 */
	public void setSqlPath(String value);

	/**
	 * Getter for <code>information_schema.SCHEMATA.SQL_PATH</code>.
	 */
	public String getSqlPath();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ISchemata
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.ISchemata from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ISchemata
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.ISchemata> E into(E into);
}
