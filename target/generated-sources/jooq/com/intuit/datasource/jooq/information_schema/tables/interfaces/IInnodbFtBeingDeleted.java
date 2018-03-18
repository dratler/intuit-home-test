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
public interface IInnodbFtBeingDeleted extends Serializable {

	/**
	 * Setter for <code>information_schema.INNODB_FT_BEING_DELETED.DOC_ID</code>.
	 */
	public void setDocId(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_FT_BEING_DELETED.DOC_ID</code>.
	 */
	public ULong getDocId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IInnodbFtBeingDeleted
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbFtBeingDeleted from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IInnodbFtBeingDeleted
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbFtBeingDeleted> E into(E into);
}
