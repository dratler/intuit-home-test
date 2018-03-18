/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.Files;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IFiles;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
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
public class FilesRecord extends TableRecordImpl<FilesRecord> implements IFiles {

	private static final long serialVersionUID = -822108368;

	/**
	 * Setter for <code>information_schema.FILES.FILE_ID</code>.
	 */
	@Override
	public void setFileId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FILE_ID</code>.
	 */
	@Override
	public Long getFileId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.FILES.FILE_NAME</code>.
	 */
	@Override
	public void setFileName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FILE_NAME</code>.
	 */
	@Override
	public String getFileName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.FILES.FILE_TYPE</code>.
	 */
	@Override
	public void setFileType(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FILE_TYPE</code>.
	 */
	@Override
	public String getFileType() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
	 */
	@Override
	public void setTablespaceName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
	 */
	@Override
	public String getTablespaceName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLE_CATALOG</code>.
	 */
	@Override
	public void setTableCatalog(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLE_CATALOG</code>.
	 */
	@Override
	public String getTableCatalog() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
	 */
	@Override
	public void setTableSchema(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
	 */
	@Override
	public String getTableSchema() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLE_NAME</code>.
	 */
	@Override
	public void setTableName(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLE_NAME</code>.
	 */
	@Override
	public String getTableName() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
	 */
	@Override
	public void setLogfileGroupName(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
	 */
	@Override
	public String getLogfileGroupName() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
	 */
	@Override
	public void setLogfileGroupNumber(Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
	 */
	@Override
	public Long getLogfileGroupNumber() {
		return (Long) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.FILES.ENGINE</code>.
	 */
	@Override
	public void setEngine(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.ENGINE</code>.
	 */
	@Override
	public String getEngine() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
	 */
	@Override
	public void setFulltextKeys(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
	 */
	@Override
	public String getFulltextKeys() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.FILES.DELETED_ROWS</code>.
	 */
	@Override
	public void setDeletedRows(Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.DELETED_ROWS</code>.
	 */
	@Override
	public Long getDeletedRows() {
		return (Long) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.FILES.UPDATE_COUNT</code>.
	 */
	@Override
	public void setUpdateCount(Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.UPDATE_COUNT</code>.
	 */
	@Override
	public Long getUpdateCount() {
		return (Long) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.FILES.FREE_EXTENTS</code>.
	 */
	@Override
	public void setFreeExtents(Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FREE_EXTENTS</code>.
	 */
	@Override
	public Long getFreeExtents() {
		return (Long) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
	 */
	@Override
	public void setTotalExtents(Long value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
	 */
	@Override
	public Long getTotalExtents() {
		return (Long) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.FILES.EXTENT_SIZE</code>.
	 */
	@Override
	public void setExtentSize(Long value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.EXTENT_SIZE</code>.
	 */
	@Override
	public Long getExtentSize() {
		return (Long) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.FILES.INITIAL_SIZE</code>.
	 */
	@Override
	public void setInitialSize(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.INITIAL_SIZE</code>.
	 */
	@Override
	public ULong getInitialSize() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
	 */
	@Override
	public void setMaximumSize(ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
	 */
	@Override
	public ULong getMaximumSize() {
		return (ULong) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
	 */
	@Override
	public void setAutoextendSize(ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
	 */
	@Override
	public ULong getAutoextendSize() {
		return (ULong) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.FILES.CREATION_TIME</code>.
	 */
	@Override
	public void setCreationTime(Timestamp value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.CREATION_TIME</code>.
	 */
	@Override
	public Timestamp getCreationTime() {
		return (Timestamp) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
	 */
	@Override
	public void setLastUpdateTime(Timestamp value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
	 */
	@Override
	public Timestamp getLastUpdateTime() {
		return (Timestamp) getValue(20);
	}

	/**
	 * Setter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
	 */
	@Override
	public void setLastAccessTime(Timestamp value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
	 */
	@Override
	public Timestamp getLastAccessTime() {
		return (Timestamp) getValue(21);
	}

	/**
	 * Setter for <code>information_schema.FILES.RECOVER_TIME</code>.
	 */
	@Override
	public void setRecoverTime(Long value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.RECOVER_TIME</code>.
	 */
	@Override
	public Long getRecoverTime() {
		return (Long) getValue(22);
	}

	/**
	 * Setter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
	 */
	@Override
	public void setTransactionCounter(Long value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
	 */
	@Override
	public Long getTransactionCounter() {
		return (Long) getValue(23);
	}

	/**
	 * Setter for <code>information_schema.FILES.VERSION</code>.
	 */
	@Override
	public void setVersion(ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.VERSION</code>.
	 */
	@Override
	public ULong getVersion() {
		return (ULong) getValue(24);
	}

	/**
	 * Setter for <code>information_schema.FILES.ROW_FORMAT</code>.
	 */
	@Override
	public void setRowFormat(String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.ROW_FORMAT</code>.
	 */
	@Override
	public String getRowFormat() {
		return (String) getValue(25);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLE_ROWS</code>.
	 */
	@Override
	public void setTableRows(ULong value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLE_ROWS</code>.
	 */
	@Override
	public ULong getTableRows() {
		return (ULong) getValue(26);
	}

	/**
	 * Setter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
	 */
	@Override
	public void setAvgRowLength(ULong value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
	 */
	@Override
	public ULong getAvgRowLength() {
		return (ULong) getValue(27);
	}

	/**
	 * Setter for <code>information_schema.FILES.DATA_LENGTH</code>.
	 */
	@Override
	public void setDataLength(ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.DATA_LENGTH</code>.
	 */
	@Override
	public ULong getDataLength() {
		return (ULong) getValue(28);
	}

	/**
	 * Setter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
	 */
	@Override
	public void setMaxDataLength(ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
	 */
	@Override
	public ULong getMaxDataLength() {
		return (ULong) getValue(29);
	}

	/**
	 * Setter for <code>information_schema.FILES.INDEX_LENGTH</code>.
	 */
	@Override
	public void setIndexLength(ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.INDEX_LENGTH</code>.
	 */
	@Override
	public ULong getIndexLength() {
		return (ULong) getValue(30);
	}

	/**
	 * Setter for <code>information_schema.FILES.DATA_FREE</code>.
	 */
	@Override
	public void setDataFree(ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.DATA_FREE</code>.
	 */
	@Override
	public ULong getDataFree() {
		return (ULong) getValue(31);
	}

	/**
	 * Setter for <code>information_schema.FILES.CREATE_TIME</code>.
	 */
	@Override
	public void setCreateTime(Timestamp value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.CREATE_TIME</code>.
	 */
	@Override
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(32);
	}

	/**
	 * Setter for <code>information_schema.FILES.UPDATE_TIME</code>.
	 */
	@Override
	public void setUpdateTime(Timestamp value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.UPDATE_TIME</code>.
	 */
	@Override
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(33);
	}

	/**
	 * Setter for <code>information_schema.FILES.CHECK_TIME</code>.
	 */
	@Override
	public void setCheckTime(Timestamp value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.CHECK_TIME</code>.
	 */
	@Override
	public Timestamp getCheckTime() {
		return (Timestamp) getValue(34);
	}

	/**
	 * Setter for <code>information_schema.FILES.CHECKSUM</code>.
	 */
	@Override
	public void setChecksum(ULong value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.CHECKSUM</code>.
	 */
	@Override
	public ULong getChecksum() {
		return (ULong) getValue(35);
	}

	/**
	 * Setter for <code>information_schema.FILES.STATUS</code>.
	 */
	@Override
	public void setStatus(String value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.STATUS</code>.
	 */
	@Override
	public String getStatus() {
		return (String) getValue(36);
	}

	/**
	 * Setter for <code>information_schema.FILES.EXTRA</code>.
	 */
	@Override
	public void setExtra(String value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.EXTRA</code>.
	 */
	@Override
	public String getExtra() {
		return (String) getValue(37);
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IFiles from) {
		setFileId(from.getFileId());
		setFileName(from.getFileName());
		setFileType(from.getFileType());
		setTablespaceName(from.getTablespaceName());
		setTableCatalog(from.getTableCatalog());
		setTableSchema(from.getTableSchema());
		setTableName(from.getTableName());
		setLogfileGroupName(from.getLogfileGroupName());
		setLogfileGroupNumber(from.getLogfileGroupNumber());
		setEngine(from.getEngine());
		setFulltextKeys(from.getFulltextKeys());
		setDeletedRows(from.getDeletedRows());
		setUpdateCount(from.getUpdateCount());
		setFreeExtents(from.getFreeExtents());
		setTotalExtents(from.getTotalExtents());
		setExtentSize(from.getExtentSize());
		setInitialSize(from.getInitialSize());
		setMaximumSize(from.getMaximumSize());
		setAutoextendSize(from.getAutoextendSize());
		setCreationTime(from.getCreationTime());
		setLastUpdateTime(from.getLastUpdateTime());
		setLastAccessTime(from.getLastAccessTime());
		setRecoverTime(from.getRecoverTime());
		setTransactionCounter(from.getTransactionCounter());
		setVersion(from.getVersion());
		setRowFormat(from.getRowFormat());
		setTableRows(from.getTableRows());
		setAvgRowLength(from.getAvgRowLength());
		setDataLength(from.getDataLength());
		setMaxDataLength(from.getMaxDataLength());
		setIndexLength(from.getIndexLength());
		setDataFree(from.getDataFree());
		setCreateTime(from.getCreateTime());
		setUpdateTime(from.getUpdateTime());
		setCheckTime(from.getCheckTime());
		setChecksum(from.getChecksum());
		setStatus(from.getStatus());
		setExtra(from.getExtra());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IFiles> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FilesRecord
	 */
	public FilesRecord() {
		super(Files.FILES);
	}

	/**
	 * Create a detached, initialised FilesRecord
	 */
	public FilesRecord(Long fileId, String fileName, String fileType, String tablespaceName, String tableCatalog, String tableSchema, String tableName, String logfileGroupName, Long logfileGroupNumber, String engine, String fulltextKeys, Long deletedRows, Long updateCount, Long freeExtents, Long totalExtents, Long extentSize, ULong initialSize, ULong maximumSize, ULong autoextendSize, Timestamp creationTime, Timestamp lastUpdateTime, Timestamp lastAccessTime, Long recoverTime, Long transactionCounter, ULong version, String rowFormat, ULong tableRows, ULong avgRowLength, ULong dataLength, ULong maxDataLength, ULong indexLength, ULong dataFree, Timestamp createTime, Timestamp updateTime, Timestamp checkTime, ULong checksum, String status, String extra) {
		super(Files.FILES);

		setValue(0, fileId);
		setValue(1, fileName);
		setValue(2, fileType);
		setValue(3, tablespaceName);
		setValue(4, tableCatalog);
		setValue(5, tableSchema);
		setValue(6, tableName);
		setValue(7, logfileGroupName);
		setValue(8, logfileGroupNumber);
		setValue(9, engine);
		setValue(10, fulltextKeys);
		setValue(11, deletedRows);
		setValue(12, updateCount);
		setValue(13, freeExtents);
		setValue(14, totalExtents);
		setValue(15, extentSize);
		setValue(16, initialSize);
		setValue(17, maximumSize);
		setValue(18, autoextendSize);
		setValue(19, creationTime);
		setValue(20, lastUpdateTime);
		setValue(21, lastAccessTime);
		setValue(22, recoverTime);
		setValue(23, transactionCounter);
		setValue(24, version);
		setValue(25, rowFormat);
		setValue(26, tableRows);
		setValue(27, avgRowLength);
		setValue(28, dataLength);
		setValue(29, maxDataLength);
		setValue(30, indexLength);
		setValue(31, dataFree);
		setValue(32, createTime);
		setValue(33, updateTime);
		setValue(34, checkTime);
		setValue(35, checksum);
		setValue(36, status);
		setValue(37, extra);
	}
}
