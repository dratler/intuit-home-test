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
public interface IInnodbFtDeleted extends Serializable {

	/**
	 * Setter for <code>information_schema.INNODB_FT_DELETED.DOC_ID</code>.
	 */
	public void setDocId(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_FT_DELETED.DOC_ID</code>.
	 */
	public ULong getDocId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IInnodbFtDeleted
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbFtDeleted from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IInnodbFtDeleted
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbFtDeleted> E into(E into);
}
