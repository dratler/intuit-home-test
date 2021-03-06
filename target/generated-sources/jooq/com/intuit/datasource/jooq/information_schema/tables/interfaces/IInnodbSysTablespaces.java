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
public interface IInnodbSysTablespaces extends Serializable {

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
	 */
	public void setSpace(UInteger value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
	 */
	public UInteger getSpace();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
	 */
	public void setName(String value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
	 */
	public String getName();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
	 */
	public void setFlag(UInteger value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
	 */
	public UInteger getFlag();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_FORMAT</code>.
	 */
	public void setFileFormat(String value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_FORMAT</code>.
	 */
	public String getFileFormat();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
	 */
	public void setRowFormat(String value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
	 */
	public String getRowFormat();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
	 */
	public void setPageSize(UInteger value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
	 */
	public UInteger getPageSize();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
	 */
	public void setZipPageSize(UInteger value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
	 */
	public UInteger getZipPageSize();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE_TYPE</code>.
	 */
	public void setSpaceType(String value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE_TYPE</code>.
	 */
	public String getSpaceType();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE</code>.
	 */
	public void setFsBlockSize(UInteger value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE</code>.
	 */
	public UInteger getFsBlockSize();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_SIZE</code>.
	 */
	public void setFileSize(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_SIZE</code>.
	 */
	public ULong getFileSize();

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE</code>.
	 */
	public void setAllocatedSize(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE</code>.
	 */
	public ULong getAllocatedSize();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IInnodbSysTablespaces
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysTablespaces from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IInnodbSysTablespaces
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysTablespaces> E into(E into);
}
