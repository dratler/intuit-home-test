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
public interface IInnodbBufferPage extends Serializable {

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.POOL_ID</code>.
	 */
	public void setPoolId(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.POOL_ID</code>.
	 */
	public ULong getPoolId();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.BLOCK_ID</code>.
	 */
	public void setBlockId(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.BLOCK_ID</code>.
	 */
	public ULong getBlockId();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.SPACE</code>.
	 */
	public void setSpace(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.SPACE</code>.
	 */
	public ULong getSpace();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_NUMBER</code>.
	 */
	public void setPageNumber(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_NUMBER</code>.
	 */
	public ULong getPageNumber();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_TYPE</code>.
	 */
	public void setPageType(String value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_TYPE</code>.
	 */
	public String getPageType();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.FLUSH_TYPE</code>.
	 */
	public void setFlushType(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.FLUSH_TYPE</code>.
	 */
	public ULong getFlushType();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.FIX_COUNT</code>.
	 */
	public void setFixCount(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.FIX_COUNT</code>.
	 */
	public ULong getFixCount();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.IS_HASHED</code>.
	 */
	public void setIsHashed(String value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.IS_HASHED</code>.
	 */
	public String getIsHashed();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.NEWEST_MODIFICATION</code>.
	 */
	public void setNewestModification(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.NEWEST_MODIFICATION</code>.
	 */
	public ULong getNewestModification();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.OLDEST_MODIFICATION</code>.
	 */
	public void setOldestModification(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.OLDEST_MODIFICATION</code>.
	 */
	public ULong getOldestModification();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.ACCESS_TIME</code>.
	 */
	public void setAccessTime(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.ACCESS_TIME</code>.
	 */
	public ULong getAccessTime();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.TABLE_NAME</code>.
	 */
	public void setTableName(String value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.TABLE_NAME</code>.
	 */
	public String getTableName();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.INDEX_NAME</code>.
	 */
	public void setIndexName(String value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.INDEX_NAME</code>.
	 */
	public String getIndexName();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.NUMBER_RECORDS</code>.
	 */
	public void setNumberRecords(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.NUMBER_RECORDS</code>.
	 */
	public ULong getNumberRecords();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.DATA_SIZE</code>.
	 */
	public void setDataSize(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.DATA_SIZE</code>.
	 */
	public ULong getDataSize();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.COMPRESSED_SIZE</code>.
	 */
	public void setCompressedSize(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.COMPRESSED_SIZE</code>.
	 */
	public ULong getCompressedSize();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_STATE</code>.
	 */
	public void setPageState(String value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_STATE</code>.
	 */
	public String getPageState();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.IO_FIX</code>.
	 */
	public void setIoFix(String value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.IO_FIX</code>.
	 */
	public String getIoFix();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.IS_OLD</code>.
	 */
	public void setIsOld(String value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.IS_OLD</code>.
	 */
	public String getIsOld();

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK</code>.
	 */
	public void setFreePageClock(ULong value);

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK</code>.
	 */
	public ULong getFreePageClock();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IInnodbBufferPage
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbBufferPage from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IInnodbBufferPage
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbBufferPage> E into(E into);
}
