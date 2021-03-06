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
public interface IKeyColumnUsage extends Serializable {

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
	 */
	public void setConstraintCatalog(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
	 */
	public String getConstraintCatalog();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
	 */
	public void setConstraintSchema(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
	 */
	public String getConstraintSchema();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
	 */
	public void setConstraintName(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
	 */
	public String getConstraintName();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
	 */
	public String getTableCatalog();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
	 */
	public String getTableSchema();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
	 */
	public void setTableName(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
	 */
	public String getTableName();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
	 */
	public void setColumnName(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
	 */
	public String getColumnName();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
	 */
	public void setOrdinalPosition(Long value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
	 */
	public Long getOrdinalPosition();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
	 */
	public void setPositionInUniqueConstraint(Long value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
	 */
	public Long getPositionInUniqueConstraint();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
	 */
	public void setReferencedTableSchema(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
	 */
	public String getReferencedTableSchema();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
	 */
	public void setReferencedTableName(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
	 */
	public String getReferencedTableName();

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
	 */
	public void setReferencedColumnName(String value);

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
	 */
	public String getReferencedColumnName();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IKeyColumnUsage
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IKeyColumnUsage from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IKeyColumnUsage
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IKeyColumnUsage> E into(E into);
}
