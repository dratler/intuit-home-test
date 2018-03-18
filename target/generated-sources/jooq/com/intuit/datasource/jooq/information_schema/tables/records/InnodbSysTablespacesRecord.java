/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.InnodbSysTablespaces;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysTablespaces;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;
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
public class InnodbSysTablespacesRecord extends TableRecordImpl<InnodbSysTablespacesRecord> implements Record11<UInteger, String, UInteger, String, String, UInteger, UInteger, String, UInteger, ULong, ULong>, IInnodbSysTablespaces {

	private static final long serialVersionUID = -98272404;

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
	 */
	@Override
	public void setSpace(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
	 */
	@Override
	public UInteger getSpace() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
	 */
	@Override
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
	 */
	@Override
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
	 */
	@Override
	public void setFlag(UInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
	 */
	@Override
	public UInteger getFlag() {
		return (UInteger) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_FORMAT</code>.
	 */
	@Override
	public void setFileFormat(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_FORMAT</code>.
	 */
	@Override
	public String getFileFormat() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
	 */
	@Override
	public void setRowFormat(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
	 */
	@Override
	public String getRowFormat() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
	 */
	@Override
	public void setPageSize(UInteger value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
	 */
	@Override
	public UInteger getPageSize() {
		return (UInteger) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
	 */
	@Override
	public void setZipPageSize(UInteger value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
	 */
	@Override
	public UInteger getZipPageSize() {
		return (UInteger) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE_TYPE</code>.
	 */
	@Override
	public void setSpaceType(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE_TYPE</code>.
	 */
	@Override
	public String getSpaceType() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE</code>.
	 */
	@Override
	public void setFsBlockSize(UInteger value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE</code>.
	 */
	@Override
	public UInteger getFsBlockSize() {
		return (UInteger) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_SIZE</code>.
	 */
	@Override
	public void setFileSize(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_SIZE</code>.
	 */
	@Override
	public ULong getFileSize() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE</code>.
	 */
	@Override
	public void setAllocatedSize(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE</code>.
	 */
	@Override
	public ULong getAllocatedSize() {
		return (ULong) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<UInteger, String, UInteger, String, String, UInteger, UInteger, String, UInteger, ULong, ULong> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<UInteger, String, UInteger, String, String, UInteger, UInteger, String, UInteger, ULong, ULong> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.SPACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field3() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.FLAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.FILE_FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.ROW_FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field6() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.PAGE_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field7() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.SPACE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field9() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field10() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.FILE_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field11() {
		return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value1() {
		return getSpace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value3() {
		return getFlag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getFileFormat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getRowFormat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value6() {
		return getPageSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value7() {
		return getZipPageSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getSpaceType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value9() {
		return getFsBlockSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value10() {
		return getFileSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value11() {
		return getAllocatedSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value1(UInteger value) {
		setSpace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value3(UInteger value) {
		setFlag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value4(String value) {
		setFileFormat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value5(String value) {
		setRowFormat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value6(UInteger value) {
		setPageSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value7(UInteger value) {
		setZipPageSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value8(String value) {
		setSpaceType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value9(UInteger value) {
		setFsBlockSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value10(ULong value) {
		setFileSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord value11(ULong value) {
		setAllocatedSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespacesRecord values(UInteger value1, String value2, UInteger value3, String value4, String value5, UInteger value6, UInteger value7, String value8, UInteger value9, ULong value10, ULong value11) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IInnodbSysTablespaces from) {
		setSpace(from.getSpace());
		setName(from.getName());
		setFlag(from.getFlag());
		setFileFormat(from.getFileFormat());
		setRowFormat(from.getRowFormat());
		setPageSize(from.getPageSize());
		setZipPageSize(from.getZipPageSize());
		setSpaceType(from.getSpaceType());
		setFsBlockSize(from.getFsBlockSize());
		setFileSize(from.getFileSize());
		setAllocatedSize(from.getAllocatedSize());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbSysTablespaces> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbSysTablespacesRecord
	 */
	public InnodbSysTablespacesRecord() {
		super(InnodbSysTablespaces.INNODB_SYS_TABLESPACES);
	}

	/**
	 * Create a detached, initialised InnodbSysTablespacesRecord
	 */
	public InnodbSysTablespacesRecord(UInteger space, String name, UInteger flag, String fileFormat, String rowFormat, UInteger pageSize, UInteger zipPageSize, String spaceType, UInteger fsBlockSize, ULong fileSize, ULong allocatedSize) {
		super(InnodbSysTablespaces.INNODB_SYS_TABLESPACES);

		setValue(0, space);
		setValue(1, name);
		setValue(2, flag);
		setValue(3, fileFormat);
		setValue(4, rowFormat);
		setValue(5, pageSize);
		setValue(6, zipPageSize);
		setValue(7, spaceType);
		setValue(8, fsBlockSize);
		setValue(9, fileSize);
		setValue(10, allocatedSize);
	}
}
