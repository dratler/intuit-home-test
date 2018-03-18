/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UInteger;
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
public interface IInnodbSysVirtual extends Serializable {

	/**
	 * Setter for <code>information_schema.INNODB_SYS_VIRTUAL.TABLE_ID</code>.
	 */
	public void setTableId(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_VIRTUAL.TABLE_ID</code>.
	 */
	public ULong getTableId();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_VIRTUAL.POS</code>.
	 */
	public void setPos(UInteger value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_VIRTUAL.POS</code>.
	 */
	public UInteger getPos();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_VIRTUAL.BASE_POS</code>.
	 */
	public void setBasePos(UInteger value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_VIRTUAL.BASE_POS</code>.
	 */
	public UInteger getBasePos();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IInnodbSysVirtual
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysVirtual from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IInnodbSysVirtual
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysVirtual> E into(E into);
}