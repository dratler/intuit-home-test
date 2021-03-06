/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.Columns;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IColumns;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class ColumnsRecord extends TableRecordImpl<ColumnsRecord> implements Record21<String, String, String, String, ULong, String, String, String, ULong, ULong, ULong, ULong, ULong, String, String, String, String, String, String, String, String>, IColumns {

	private static final long serialVersionUID = -1994106042;

	/**
	 * Setter for <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
	 */
	@Override
	public void setTableCatalog(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.TABLE_CATALOG</code>.
	 */
	@Override
	public String getTableCatalog() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
	 */
	@Override
	public void setTableSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.TABLE_SCHEMA</code>.
	 */
	@Override
	public String getTableSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.TABLE_NAME</code>.
	 */
	@Override
	public void setTableName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.TABLE_NAME</code>.
	 */
	@Override
	public String getTableName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.COLUMN_NAME</code>.
	 */
	@Override
	public void setColumnName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.COLUMN_NAME</code>.
	 */
	@Override
	public String getColumnName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
	 */
	@Override
	public void setOrdinalPosition(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.ORDINAL_POSITION</code>.
	 */
	@Override
	public ULong getOrdinalPosition() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
	 */
	@Override
	public void setColumnDefault(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.COLUMN_DEFAULT</code>.
	 */
	@Override
	public String getColumnDefault() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.IS_NULLABLE</code>.
	 */
	@Override
	public void setIsNullable(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.IS_NULLABLE</code>.
	 */
	@Override
	public String getIsNullable() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.DATA_TYPE</code>.
	 */
	@Override
	public void setDataType(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.DATA_TYPE</code>.
	 */
	@Override
	public String getDataType() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	@Override
	public void setCharacterMaximumLength(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	@Override
	public ULong getCharacterMaximumLength() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
	 */
	@Override
	public void setCharacterOctetLength(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
	 */
	@Override
	public ULong getCharacterOctetLength() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
	 */
	@Override
	public void setNumericPrecision(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.NUMERIC_PRECISION</code>.
	 */
	@Override
	public ULong getNumericPrecision() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
	 */
	@Override
	public void setNumericScale(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.NUMERIC_SCALE</code>.
	 */
	@Override
	public ULong getNumericScale() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
	 */
	@Override
	public void setDatetimePrecision(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.DATETIME_PRECISION</code>.
	 */
	@Override
	public ULong getDatetimePrecision() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
	 */
	@Override
	public void setCharacterSetName(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.CHARACTER_SET_NAME</code>.
	 */
	@Override
	public String getCharacterSetName() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.COLLATION_NAME</code>.
	 */
	@Override
	public void setCollationName(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.COLLATION_NAME</code>.
	 */
	@Override
	public String getCollationName() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
	 */
	@Override
	public void setColumnType(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.COLUMN_TYPE</code>.
	 */
	@Override
	public String getColumnType() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.COLUMN_KEY</code>.
	 */
	@Override
	public void setColumnKey(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.COLUMN_KEY</code>.
	 */
	@Override
	public String getColumnKey() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.EXTRA</code>.
	 */
	@Override
	public void setExtra(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.EXTRA</code>.
	 */
	@Override
	public String getExtra() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.PRIVILEGES</code>.
	 */
	@Override
	public void setPrivileges(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.PRIVILEGES</code>.
	 */
	@Override
	public String getPrivileges() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
	 */
	@Override
	public void setColumnComment(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.COLUMN_COMMENT</code>.
	 */
	@Override
	public String getColumnComment() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
	 */
	@Override
	public void setGenerationExpression(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.COLUMNS.GENERATION_EXPRESSION</code>.
	 */
	@Override
	public String getGenerationExpression() {
		return (String) getValue(20);
	}

	// -------------------------------------------------------------------------
	// Record21 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row21<String, String, String, String, ULong, String, String, String, ULong, ULong, ULong, ULong, ULong, String, String, String, String, String, String, String, String> fieldsRow() {
		return (Row21) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row21<String, String, String, String, ULong, String, String, String, ULong, ULong, ULong, ULong, ULong, String, String, String, String, String, String, String, String> valuesRow() {
		return (Row21) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Columns.COLUMNS.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Columns.COLUMNS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Columns.COLUMNS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Columns.COLUMNS.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return Columns.COLUMNS.ORDINAL_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Columns.COLUMNS.COLUMN_DEFAULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Columns.COLUMNS.IS_NULLABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Columns.COLUMNS.DATA_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field9() {
		return Columns.COLUMNS.CHARACTER_MAXIMUM_LENGTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field10() {
		return Columns.COLUMNS.CHARACTER_OCTET_LENGTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field11() {
		return Columns.COLUMNS.NUMERIC_PRECISION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field12() {
		return Columns.COLUMNS.NUMERIC_SCALE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field13() {
		return Columns.COLUMNS.DATETIME_PRECISION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return Columns.COLUMNS.CHARACTER_SET_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return Columns.COLUMNS.COLLATION_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return Columns.COLUMNS.COLUMN_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field17() {
		return Columns.COLUMNS.COLUMN_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field18() {
		return Columns.COLUMNS.EXTRA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field19() {
		return Columns.COLUMNS.PRIVILEGES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field20() {
		return Columns.COLUMNS.COLUMN_COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field21() {
		return Columns.COLUMNS.GENERATION_EXPRESSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getOrdinalPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getColumnDefault();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getIsNullable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getDataType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value9() {
		return getCharacterMaximumLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value10() {
		return getCharacterOctetLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value11() {
		return getNumericPrecision();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value12() {
		return getNumericScale();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value13() {
		return getDatetimePrecision();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getCharacterSetName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getCollationName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value16() {
		return getColumnType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value17() {
		return getColumnKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value18() {
		return getExtra();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value19() {
		return getPrivileges();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value20() {
		return getColumnComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value21() {
		return getGenerationExpression();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value1(String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value2(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value3(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value4(String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value5(ULong value) {
		setOrdinalPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value6(String value) {
		setColumnDefault(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value7(String value) {
		setIsNullable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value8(String value) {
		setDataType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value9(ULong value) {
		setCharacterMaximumLength(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value10(ULong value) {
		setCharacterOctetLength(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value11(ULong value) {
		setNumericPrecision(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value12(ULong value) {
		setNumericScale(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value13(ULong value) {
		setDatetimePrecision(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value14(String value) {
		setCharacterSetName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value15(String value) {
		setCollationName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value16(String value) {
		setColumnType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value17(String value) {
		setColumnKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value18(String value) {
		setExtra(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value19(String value) {
		setPrivileges(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value20(String value) {
		setColumnComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord value21(String value) {
		setGenerationExpression(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnsRecord values(String value1, String value2, String value3, String value4, ULong value5, String value6, String value7, String value8, ULong value9, ULong value10, ULong value11, ULong value12, ULong value13, String value14, String value15, String value16, String value17, String value18, String value19, String value20, String value21) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		value17(value17);
		value18(value18);
		value19(value19);
		value20(value20);
		value21(value21);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IColumns from) {
		setTableCatalog(from.getTableCatalog());
		setTableSchema(from.getTableSchema());
		setTableName(from.getTableName());
		setColumnName(from.getColumnName());
		setOrdinalPosition(from.getOrdinalPosition());
		setColumnDefault(from.getColumnDefault());
		setIsNullable(from.getIsNullable());
		setDataType(from.getDataType());
		setCharacterMaximumLength(from.getCharacterMaximumLength());
		setCharacterOctetLength(from.getCharacterOctetLength());
		setNumericPrecision(from.getNumericPrecision());
		setNumericScale(from.getNumericScale());
		setDatetimePrecision(from.getDatetimePrecision());
		setCharacterSetName(from.getCharacterSetName());
		setCollationName(from.getCollationName());
		setColumnType(from.getColumnType());
		setColumnKey(from.getColumnKey());
		setExtra(from.getExtra());
		setPrivileges(from.getPrivileges());
		setColumnComment(from.getColumnComment());
		setGenerationExpression(from.getGenerationExpression());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IColumns> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ColumnsRecord
	 */
	public ColumnsRecord() {
		super(Columns.COLUMNS);
	}

	/**
	 * Create a detached, initialised ColumnsRecord
	 */
	public ColumnsRecord(String tableCatalog, String tableSchema, String tableName, String columnName, ULong ordinalPosition, String columnDefault, String isNullable, String dataType, ULong characterMaximumLength, ULong characterOctetLength, ULong numericPrecision, ULong numericScale, ULong datetimePrecision, String characterSetName, String collationName, String columnType, String columnKey, String extra, String privileges, String columnComment, String generationExpression) {
		super(Columns.COLUMNS);

		setValue(0, tableCatalog);
		setValue(1, tableSchema);
		setValue(2, tableName);
		setValue(3, columnName);
		setValue(4, ordinalPosition);
		setValue(5, columnDefault);
		setValue(6, isNullable);
		setValue(7, dataType);
		setValue(8, characterMaximumLength);
		setValue(9, characterOctetLength);
		setValue(10, numericPrecision);
		setValue(11, numericScale);
		setValue(12, datetimePrecision);
		setValue(13, characterSetName);
		setValue(14, collationName);
		setValue(15, columnType);
		setValue(16, columnKey);
		setValue(17, extra);
		setValue(18, privileges);
		setValue(19, columnComment);
		setValue(20, generationExpression);
	}
}
