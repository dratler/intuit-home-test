/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables;


import com.intuit.datasource.jooq.information_schema.InformationSchema;
import com.intuit.datasource.jooq.information_schema.tables.records.ColumnsRecord;

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
public class Columns extends TableImpl<ColumnsRecord> {

	private static final long serialVersionUID = -1617309869;

	/**
	 * The reference instance of <code>information_schema.COLUMNS</code>
	 */
	public static final Columns COLUMNS = new Columns();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ColumnsRecord> getRecordType() {
		return ColumnsRecord.class;
	}

	/**
	 * The column <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
	 */
	public final TableField<ColumnsRecord, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
	 */
	public final TableField<ColumnsRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.TABLE_NAME</code>.
	 */
	public final TableField<ColumnsRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.COLUMN_NAME</code>.
	 */
	public final TableField<ColumnsRecord, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
	 */
	public final TableField<ColumnsRecord, ULong> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
	 */
	public final TableField<ColumnsRecord, String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>information_schema.COLUMNS.IS_NULLABLE</code>.
	 */
	public final TableField<ColumnsRecord, String> IS_NULLABLE = createField("IS_NULLABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.DATA_TYPE</code>.
	 */
	public final TableField<ColumnsRecord, String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public final TableField<ColumnsRecord, ULong> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
	 */
	public final TableField<ColumnsRecord, ULong> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
	 */
	public final TableField<ColumnsRecord, ULong> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
	 */
	public final TableField<ColumnsRecord, ULong> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
	 */
	public final TableField<ColumnsRecord, ULong> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
	 */
	public final TableField<ColumnsRecord, String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.COLLATION_NAME</code>.
	 */
	public final TableField<ColumnsRecord, String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
	 */
	public final TableField<ColumnsRecord, String> COLUMN_TYPE = createField("COLUMN_TYPE", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.COLUMN_KEY</code>.
	 */
	public final TableField<ColumnsRecord, String> COLUMN_KEY = createField("COLUMN_KEY", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.EXTRA</code>.
	 */
	public final TableField<ColumnsRecord, String> EXTRA = createField("EXTRA", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.PRIVILEGES</code>.
	 */
	public final TableField<ColumnsRecord, String> PRIVILEGES = createField("PRIVILEGES", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
	 */
	public final TableField<ColumnsRecord, String> COLUMN_COMMENT = createField("COLUMN_COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
	 */
	public final TableField<ColumnsRecord, String> GENERATION_EXPRESSION = createField("GENERATION_EXPRESSION", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>information_schema.COLUMNS</code> table reference
	 */
	public Columns() {
		this("COLUMNS", null);
	}

	/**
	 * Create an aliased <code>information_schema.COLUMNS</code> table reference
	 */
	public Columns(String alias) {
		this(alias, COLUMNS);
	}

	private Columns(String alias, Table<ColumnsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Columns(String alias, Table<ColumnsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Columns as(String alias) {
		return new Columns(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Columns rename(String name) {
		return new Columns(name, null);
	}
}
