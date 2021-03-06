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
public interface IInnodbCmpmem extends Serializable {

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.page_size</code>.
	 */
	public void setPageSize(Integer value);

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.page_size</code>.
	 */
	public Integer getPageSize();

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
	 */
	public void setBufferPoolInstance(Integer value);

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
	 */
	public Integer getBufferPoolInstance();

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.pages_used</code>.
	 */
	public void setPagesUsed(Integer value);

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.pages_used</code>.
	 */
	public Integer getPagesUsed();

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.pages_free</code>.
	 */
	public void setPagesFree(Integer value);

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.pages_free</code>.
	 */
	public Integer getPagesFree();

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
	 */
	public void setRelocationOps(Long value);

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
	 */
	public Long getRelocationOps();

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
	 */
	public void setRelocationTime(Integer value);

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
	 */
	public Integer getRelocationTime();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IInnodbCmpmem
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbCmpmem from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IInnodbCmpmem
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbCmpmem> E into(E into);
}
