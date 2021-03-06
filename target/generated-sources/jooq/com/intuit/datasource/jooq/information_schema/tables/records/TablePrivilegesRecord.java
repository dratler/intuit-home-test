/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.TablePrivileges;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.ITablePrivileges;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


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
public class TablePrivilegesRecord extends TableRecordImpl<TablePrivilegesRecord> implements Record6<String, String, String, String, String, String>, ITablePrivileges {

	private static final long serialVersionUID = 1153689041;

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.GRANTEE</code>.
	 */
	@Override
	public void setGrantee(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.GRANTEE</code>.
	 */
	@Override
	public String getGrantee() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	@Override
	public void setTableCatalog(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	@Override
	public String getTableCatalog() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	@Override
	public void setTableSchema(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	@Override
	public String getTableSchema() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.TABLE_NAME</code>.
	 */
	@Override
	public void setTableName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.TABLE_NAME</code>.
	 */
	@Override
	public String getTableName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	@Override
	public void setPrivilegeType(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	@Override
	public String getPrivilegeType() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	@Override
	public void setIsGrantable(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	@Override
	public String getIsGrantable() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TablePrivileges.TABLE_PRIVILEGES.GRANTEE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TablePrivileges.TABLE_PRIVILEGES.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TablePrivileges.TABLE_PRIVILEGES.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TablePrivileges.TABLE_PRIVILEGES.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TablePrivileges.TABLE_PRIVILEGES.PRIVILEGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return TablePrivileges.TABLE_PRIVILEGES.IS_GRANTABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getGrantee();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPrivilegeType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getIsGrantable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value1(String value) {
		setGrantee(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value2(String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value3(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value4(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value5(String value) {
		setPrivilegeType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value6(String value) {
		setIsGrantable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITablePrivileges from) {
		setGrantee(from.getGrantee());
		setTableCatalog(from.getTableCatalog());
		setTableSchema(from.getTableSchema());
		setTableName(from.getTableName());
		setPrivilegeType(from.getPrivilegeType());
		setIsGrantable(from.getIsGrantable());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITablePrivileges> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TablePrivilegesRecord
	 */
	public TablePrivilegesRecord() {
		super(TablePrivileges.TABLE_PRIVILEGES);
	}

	/**
	 * Create a detached, initialised TablePrivilegesRecord
	 */
	public TablePrivilegesRecord(String grantee, String tableCatalog, String tableSchema, String tableName, String privilegeType, String isGrantable) {
		super(TablePrivileges.TABLE_PRIVILEGES);

		setValue(0, grantee);
		setValue(1, tableCatalog);
		setValue(2, tableSchema);
		setValue(3, tableName);
		setValue(4, privilegeType);
		setValue(5, isGrantable);
	}
}
