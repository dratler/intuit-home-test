/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables;


import com.intuit.datasource.jooq.information_schema.InformationSchema;
import com.intuit.datasource.jooq.information_schema.tables.records.PartitionsRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class Partitions extends TableImpl<PartitionsRecord> {

	private static final long serialVersionUID = 2014093396;

	/**
	 * The reference instance of <code>information_schema.PARTITIONS</code>
	 */
	public static final Partitions PARTITIONS = new Partitions();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PartitionsRecord> getRecordType() {
		return PartitionsRecord.class;
	}

	/**
	 * The column <code>information_schema.PARTITIONS.TABLE_CATALOG</code>.
	 */
	public final TableField<PartitionsRecord, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.TABLE_SCHEMA</code>.
	 */
	public final TableField<PartitionsRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.TABLE_NAME</code>.
	 */
	public final TableField<PartitionsRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.PARTITION_NAME</code>.
	 */
	public final TableField<PartitionsRecord, String> PARTITION_NAME = createField("PARTITION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.SUBPARTITION_NAME</code>.
	 */
	public final TableField<PartitionsRecord, String> SUBPARTITION_NAME = createField("SUBPARTITION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.PARTITION_ORDINAL_POSITION</code>.
	 */
	public final TableField<PartitionsRecord, ULong> PARTITION_ORDINAL_POSITION = createField("PARTITION_ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.SUBPARTITION_ORDINAL_POSITION</code>.
	 */
	public final TableField<PartitionsRecord, ULong> SUBPARTITION_ORDINAL_POSITION = createField("SUBPARTITION_ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.PARTITION_METHOD</code>.
	 */
	public final TableField<PartitionsRecord, String> PARTITION_METHOD = createField("PARTITION_METHOD", org.jooq.impl.SQLDataType.VARCHAR.length(18), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.SUBPARTITION_METHOD</code>.
	 */
	public final TableField<PartitionsRecord, String> SUBPARTITION_METHOD = createField("SUBPARTITION_METHOD", org.jooq.impl.SQLDataType.VARCHAR.length(12), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.PARTITION_EXPRESSION</code>.
	 */
	public final TableField<PartitionsRecord, String> PARTITION_EXPRESSION = createField("PARTITION_EXPRESSION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.SUBPARTITION_EXPRESSION</code>.
	 */
	public final TableField<PartitionsRecord, String> SUBPARTITION_EXPRESSION = createField("SUBPARTITION_EXPRESSION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.PARTITION_DESCRIPTION</code>.
	 */
	public final TableField<PartitionsRecord, String> PARTITION_DESCRIPTION = createField("PARTITION_DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.TABLE_ROWS</code>.
	 */
	public final TableField<PartitionsRecord, ULong> TABLE_ROWS = createField("TABLE_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.AVG_ROW_LENGTH</code>.
	 */
	public final TableField<PartitionsRecord, ULong> AVG_ROW_LENGTH = createField("AVG_ROW_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.DATA_LENGTH</code>.
	 */
	public final TableField<PartitionsRecord, ULong> DATA_LENGTH = createField("DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.MAX_DATA_LENGTH</code>.
	 */
	public final TableField<PartitionsRecord, ULong> MAX_DATA_LENGTH = createField("MAX_DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.INDEX_LENGTH</code>.
	 */
	public final TableField<PartitionsRecord, ULong> INDEX_LENGTH = createField("INDEX_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.DATA_FREE</code>.
	 */
	public final TableField<PartitionsRecord, ULong> DATA_FREE = createField("DATA_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.CREATE_TIME</code>.
	 */
	public final TableField<PartitionsRecord, Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.UPDATE_TIME</code>.
	 */
	public final TableField<PartitionsRecord, Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.CHECK_TIME</code>.
	 */
	public final TableField<PartitionsRecord, Timestamp> CHECK_TIME = createField("CHECK_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.CHECKSUM</code>.
	 */
	public final TableField<PartitionsRecord, ULong> CHECKSUM = createField("CHECKSUM", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.PARTITION_COMMENT</code>.
	 */
	public final TableField<PartitionsRecord, String> PARTITION_COMMENT = createField("PARTITION_COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.NODEGROUP</code>.
	 */
	public final TableField<PartitionsRecord, String> NODEGROUP = createField("NODEGROUP", org.jooq.impl.SQLDataType.VARCHAR.length(12).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PARTITIONS.TABLESPACE_NAME</code>.
	 */
	public final TableField<PartitionsRecord, String> TABLESPACE_NAME = createField("TABLESPACE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * Create a <code>information_schema.PARTITIONS</code> table reference
	 */
	public Partitions() {
		this("PARTITIONS", null);
	}

	/**
	 * Create an aliased <code>information_schema.PARTITIONS</code> table reference
	 */
	public Partitions(String alias) {
		this(alias, PARTITIONS);
	}

	private Partitions(String alias, Table<PartitionsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Partitions(String alias, Table<PartitionsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Partitions as(String alias) {
		return new Partitions(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Partitions rename(String name) {
		return new Partitions(name, null);
	}
}
