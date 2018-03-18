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
public interface IInnodbSysColumns extends Serializable {

	/**
	 * Setter for <code>information_schema.INNODB_SYS_COLUMNS.TABLE_ID</code>.
	 */
	public void setTableId(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_COLUMNS.TABLE_ID</code>.
	 */
	public ULong getTableId();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_COLUMNS.NAME</code>.
	 */
	public void setName(String value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_COLUMNS.NAME</code>.
	 */
	public String getName();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_COLUMNS.POS</code>.
	 */
	public void setPos(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_COLUMNS.POS</code>.
	 */
	public ULong getPos();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_COLUMNS.MTYPE</code>.
	 */
	public void setMtype(Integer value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_COLUMNS.MTYPE</code>.
	 */
	public Integer getMtype();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_COLUMNS.PRTYPE</code>.
	 */
	public void setPrtype(Integer value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_COLUMNS.PRTYPE</code>.
	 */
	public Integer getPrtype();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_COLUMNS.LEN</code>.
	 */
	public void setLen(Integer value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_COLUMNS.LEN</code>.
	 */
	public Integer getLen();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IInnodbSysColumns
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysColumns from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IInnodbSysColumns
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysColumns> E into(E into);
}