/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

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
public interface IFiles extends Serializable {

	/**
	 * Setter for <code>information_schema.FILES.FILE_ID</code>.
	 */
	public void setFileId(Long value);

	/**
	 * Getter for <code>information_schema.FILES.FILE_ID</code>.
	 */
	public Long getFileId();

	/**
	 * Setter for <code>information_schema.FILES.FILE_NAME</code>.
	 */
	public void setFileName(String value);

	/**
	 * Getter for <code>information_schema.FILES.FILE_NAME</code>.
	 */
	public String getFileName();

	/**
	 * Setter for <code>information_schema.FILES.FILE_TYPE</code>.
	 */
	public void setFileType(String value);

	/**
	 * Getter for <code>information_schema.FILES.FILE_TYPE</code>.
	 */
	public String getFileType();

	/**
	 * Setter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
	 */
	public void setTablespaceName(String value);

	/**
	 * Getter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
	 */
	public String getTablespaceName();

	/**
	 * Setter for <code>information_schema.FILES.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(String value);

	/**
	 * Getter for <code>information_schema.FILES.TABLE_CATALOG</code>.
	 */
	public String getTableCatalog();

	/**
	 * Setter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(String value);

	/**
	 * Getter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
	 */
	public String getTableSchema();

	/**
	 * Setter for <code>information_schema.FILES.TABLE_NAME</code>.
	 */
	public void setTableName(String value);

	/**
	 * Getter for <code>information_schema.FILES.TABLE_NAME</code>.
	 */
	public String getTableName();

	/**
	 * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
	 */
	public void setLogfileGroupName(String value);

	/**
	 * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
	 */
	public String getLogfileGroupName();

	/**
	 * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
	 */
	public void setLogfileGroupNumber(Long value);

	/**
	 * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
	 */
	public Long getLogfileGroupNumber();

	/**
	 * Setter for <code>information_schema.FILES.ENGINE</code>.
	 */
	public void setEngine(String value);

	/**
	 * Getter for <code>information_schema.FILES.ENGINE</code>.
	 */
	public String getEngine();

	/**
	 * Setter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
	 */
	public void setFulltextKeys(String value);

	/**
	 * Getter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
	 */
	public String getFulltextKeys();

	/**
	 * Setter for <code>information_schema.FILES.DELETED_ROWS</code>.
	 */
	public void setDeletedRows(Long value);

	/**
	 * Getter for <code>information_schema.FILES.DELETED_ROWS</code>.
	 */
	public Long getDeletedRows();

	/**
	 * Setter for <code>information_schema.FILES.UPDATE_COUNT</code>.
	 */
	public void setUpdateCount(Long value);

	/**
	 * Getter for <code>information_schema.FILES.UPDATE_COUNT</code>.
	 */
	public Long getUpdateCount();

	/**
	 * Setter for <code>information_schema.FILES.FREE_EXTENTS</code>.
	 */
	public void setFreeExtents(Long value);

	/**
	 * Getter for <code>information_schema.FILES.FREE_EXTENTS</code>.
	 */
	public Long getFreeExtents();

	/**
	 * Setter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
	 */
	public void setTotalExtents(Long value);

	/**
	 * Getter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
	 */
	public Long getTotalExtents();

	/**
	 * Setter for <code>information_schema.FILES.EXTENT_SIZE</code>.
	 */
	public void setExtentSize(Long value);

	/**
	 * Getter for <code>information_schema.FILES.EXTENT_SIZE</code>.
	 */
	public Long getExtentSize();

	/**
	 * Setter for <code>information_schema.FILES.INITIAL_SIZE</code>.
	 */
	public void setInitialSize(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.INITIAL_SIZE</code>.
	 */
	public ULong getInitialSize();

	/**
	 * Setter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
	 */
	public void setMaximumSize(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
	 */
	public ULong getMaximumSize();

	/**
	 * Setter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
	 */
	public void setAutoextendSize(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
	 */
	public ULong getAutoextendSize();

	/**
	 * Setter for <code>information_schema.FILES.CREATION_TIME</code>.
	 */
	public void setCreationTime(Timestamp value);

	/**
	 * Getter for <code>information_schema.FILES.CREATION_TIME</code>.
	 */
	public Timestamp getCreationTime();

	/**
	 * Setter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
	 */
	public void setLastUpdateTime(Timestamp value);

	/**
	 * Getter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
	 */
	public Timestamp getLastUpdateTime();

	/**
	 * Setter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
	 */
	public void setLastAccessTime(Timestamp value);

	/**
	 * Getter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
	 */
	public Timestamp getLastAccessTime();

	/**
	 * Setter for <code>information_schema.FILES.RECOVER_TIME</code>.
	 */
	public void setRecoverTime(Long value);

	/**
	 * Getter for <code>information_schema.FILES.RECOVER_TIME</code>.
	 */
	public Long getRecoverTime();

	/**
	 * Setter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
	 */
	public void setTransactionCounter(Long value);

	/**
	 * Getter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
	 */
	public Long getTransactionCounter();

	/**
	 * Setter for <code>information_schema.FILES.VERSION</code>.
	 */
	public void setVersion(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.VERSION</code>.
	 */
	public ULong getVersion();

	/**
	 * Setter for <code>information_schema.FILES.ROW_FORMAT</code>.
	 */
	public void setRowFormat(String value);

	/**
	 * Getter for <code>information_schema.FILES.ROW_FORMAT</code>.
	 */
	public String getRowFormat();

	/**
	 * Setter for <code>information_schema.FILES.TABLE_ROWS</code>.
	 */
	public void setTableRows(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.TABLE_ROWS</code>.
	 */
	public ULong getTableRows();

	/**
	 * Setter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
	 */
	public void setAvgRowLength(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
	 */
	public ULong getAvgRowLength();

	/**
	 * Setter for <code>information_schema.FILES.DATA_LENGTH</code>.
	 */
	public void setDataLength(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.DATA_LENGTH</code>.
	 */
	public ULong getDataLength();

	/**
	 * Setter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
	 */
	public void setMaxDataLength(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
	 */
	public ULong getMaxDataLength();

	/**
	 * Setter for <code>information_schema.FILES.INDEX_LENGTH</code>.
	 */
	public void setIndexLength(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.INDEX_LENGTH</code>.
	 */
	public ULong getIndexLength();

	/**
	 * Setter for <code>information_schema.FILES.DATA_FREE</code>.
	 */
	public void setDataFree(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.DATA_FREE</code>.
	 */
	public ULong getDataFree();

	/**
	 * Setter for <code>information_schema.FILES.CREATE_TIME</code>.
	 */
	public void setCreateTime(Timestamp value);

	/**
	 * Getter for <code>information_schema.FILES.CREATE_TIME</code>.
	 */
	public Timestamp getCreateTime();

	/**
	 * Setter for <code>information_schema.FILES.UPDATE_TIME</code>.
	 */
	public void setUpdateTime(Timestamp value);

	/**
	 * Getter for <code>information_schema.FILES.UPDATE_TIME</code>.
	 */
	public Timestamp getUpdateTime();

	/**
	 * Setter for <code>information_schema.FILES.CHECK_TIME</code>.
	 */
	public void setCheckTime(Timestamp value);

	/**
	 * Getter for <code>information_schema.FILES.CHECK_TIME</code>.
	 */
	public Timestamp getCheckTime();

	/**
	 * Setter for <code>information_schema.FILES.CHECKSUM</code>.
	 */
	public void setChecksum(ULong value);

	/**
	 * Getter for <code>information_schema.FILES.CHECKSUM</code>.
	 */
	public ULong getChecksum();

	/**
	 * Setter for <code>information_schema.FILES.STATUS</code>.
	 */
	public void setStatus(String value);

	/**
	 * Getter for <code>information_schema.FILES.STATUS</code>.
	 */
	public String getStatus();

	/**
	 * Setter for <code>information_schema.FILES.EXTRA</code>.
	 */
	public void setExtra(String value);

	/**
	 * Getter for <code>information_schema.FILES.EXTRA</code>.
	 */
	public String getExtra();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IFiles
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IFiles from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IFiles
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IFiles> E into(E into);
}