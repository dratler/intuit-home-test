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
public interface IPartitions extends Serializable {

	/**
	 * Setter for <code>information_schema.PARTITIONS.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.TABLE_CATALOG</code>.
	 */
	public String getTableCatalog();

	/**
	 * Setter for <code>information_schema.PARTITIONS.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.TABLE_SCHEMA</code>.
	 */
	public String getTableSchema();

	/**
	 * Setter for <code>information_schema.PARTITIONS.TABLE_NAME</code>.
	 */
	public void setTableName(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.TABLE_NAME</code>.
	 */
	public String getTableName();

	/**
	 * Setter for <code>information_schema.PARTITIONS.PARTITION_NAME</code>.
	 */
	public void setPartitionName(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.PARTITION_NAME</code>.
	 */
	public String getPartitionName();

	/**
	 * Setter for <code>information_schema.PARTITIONS.SUBPARTITION_NAME</code>.
	 */
	public void setSubpartitionName(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.SUBPARTITION_NAME</code>.
	 */
	public String getSubpartitionName();

	/**
	 * Setter for <code>information_schema.PARTITIONS.PARTITION_ORDINAL_POSITION</code>.
	 */
	public void setPartitionOrdinalPosition(ULong value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.PARTITION_ORDINAL_POSITION</code>.
	 */
	public ULong getPartitionOrdinalPosition();

	/**
	 * Setter for <code>information_schema.PARTITIONS.SUBPARTITION_ORDINAL_POSITION</code>.
	 */
	public void setSubpartitionOrdinalPosition(ULong value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.SUBPARTITION_ORDINAL_POSITION</code>.
	 */
	public ULong getSubpartitionOrdinalPosition();

	/**
	 * Setter for <code>information_schema.PARTITIONS.PARTITION_METHOD</code>.
	 */
	public void setPartitionMethod(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.PARTITION_METHOD</code>.
	 */
	public String getPartitionMethod();

	/**
	 * Setter for <code>information_schema.PARTITIONS.SUBPARTITION_METHOD</code>.
	 */
	public void setSubpartitionMethod(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.SUBPARTITION_METHOD</code>.
	 */
	public String getSubpartitionMethod();

	/**
	 * Setter for <code>information_schema.PARTITIONS.PARTITION_EXPRESSION</code>.
	 */
	public void setPartitionExpression(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.PARTITION_EXPRESSION</code>.
	 */
	public String getPartitionExpression();

	/**
	 * Setter for <code>information_schema.PARTITIONS.SUBPARTITION_EXPRESSION</code>.
	 */
	public void setSubpartitionExpression(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.SUBPARTITION_EXPRESSION</code>.
	 */
	public String getSubpartitionExpression();

	/**
	 * Setter for <code>information_schema.PARTITIONS.PARTITION_DESCRIPTION</code>.
	 */
	public void setPartitionDescription(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.PARTITION_DESCRIPTION</code>.
	 */
	public String getPartitionDescription();

	/**
	 * Setter for <code>information_schema.PARTITIONS.TABLE_ROWS</code>.
	 */
	public void setTableRows(ULong value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.TABLE_ROWS</code>.
	 */
	public ULong getTableRows();

	/**
	 * Setter for <code>information_schema.PARTITIONS.AVG_ROW_LENGTH</code>.
	 */
	public void setAvgRowLength(ULong value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.AVG_ROW_LENGTH</code>.
	 */
	public ULong getAvgRowLength();

	/**
	 * Setter for <code>information_schema.PARTITIONS.DATA_LENGTH</code>.
	 */
	public void setDataLength(ULong value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.DATA_LENGTH</code>.
	 */
	public ULong getDataLength();

	/**
	 * Setter for <code>information_schema.PARTITIONS.MAX_DATA_LENGTH</code>.
	 */
	public void setMaxDataLength(ULong value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.MAX_DATA_LENGTH</code>.
	 */
	public ULong getMaxDataLength();

	/**
	 * Setter for <code>information_schema.PARTITIONS.INDEX_LENGTH</code>.
	 */
	public void setIndexLength(ULong value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.INDEX_LENGTH</code>.
	 */
	public ULong getIndexLength();

	/**
	 * Setter for <code>information_schema.PARTITIONS.DATA_FREE</code>.
	 */
	public void setDataFree(ULong value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.DATA_FREE</code>.
	 */
	public ULong getDataFree();

	/**
	 * Setter for <code>information_schema.PARTITIONS.CREATE_TIME</code>.
	 */
	public void setCreateTime(Timestamp value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.CREATE_TIME</code>.
	 */
	public Timestamp getCreateTime();

	/**
	 * Setter for <code>information_schema.PARTITIONS.UPDATE_TIME</code>.
	 */
	public void setUpdateTime(Timestamp value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.UPDATE_TIME</code>.
	 */
	public Timestamp getUpdateTime();

	/**
	 * Setter for <code>information_schema.PARTITIONS.CHECK_TIME</code>.
	 */
	public void setCheckTime(Timestamp value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.CHECK_TIME</code>.
	 */
	public Timestamp getCheckTime();

	/**
	 * Setter for <code>information_schema.PARTITIONS.CHECKSUM</code>.
	 */
	public void setChecksum(ULong value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.CHECKSUM</code>.
	 */
	public ULong getChecksum();

	/**
	 * Setter for <code>information_schema.PARTITIONS.PARTITION_COMMENT</code>.
	 */
	public void setPartitionComment(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.PARTITION_COMMENT</code>.
	 */
	public String getPartitionComment();

	/**
	 * Setter for <code>information_schema.PARTITIONS.NODEGROUP</code>.
	 */
	public void setNodegroup(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.NODEGROUP</code>.
	 */
	public String getNodegroup();

	/**
	 * Setter for <code>information_schema.PARTITIONS.TABLESPACE_NAME</code>.
	 */
	public void setTablespaceName(String value);

	/**
	 * Getter for <code>information_schema.PARTITIONS.TABLESPACE_NAME</code>.
	 */
	public String getTablespaceName();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IPartitions
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IPartitions from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IPartitions
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IPartitions> E into(E into);
}
