/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.InnodbSysTablestats;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysTablestats;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class InnodbSysTablestatsRecord extends TableRecordImpl<InnodbSysTablestatsRecord> implements Record9<ULong, String, String, ULong, ULong, ULong, ULong, ULong, Integer>, IInnodbSysTablestats {

	private static final long serialVersionUID = 1547845248;

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.TABLE_ID</code>.
	 */
	@Override
	public void setTableId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.TABLE_ID</code>.
	 */
	@Override
	public ULong getTableId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.NAME</code>.
	 */
	@Override
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.NAME</code>.
	 */
	@Override
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.STATS_INITIALIZED</code>.
	 */
	@Override
	public void setStatsInitialized(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.STATS_INITIALIZED</code>.
	 */
	@Override
	public String getStatsInitialized() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.NUM_ROWS</code>.
	 */
	@Override
	public void setNumRows(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.NUM_ROWS</code>.
	 */
	@Override
	public ULong getNumRows() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE</code>.
	 */
	@Override
	public void setClustIndexSize(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE</code>.
	 */
	@Override
	public ULong getClustIndexSize() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE</code>.
	 */
	@Override
	public void setOtherIndexSize(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE</code>.
	 */
	@Override
	public ULong getOtherIndexSize() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER</code>.
	 */
	@Override
	public void setModifiedCounter(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER</code>.
	 */
	@Override
	public ULong getModifiedCounter() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.AUTOINC</code>.
	 */
	@Override
	public void setAutoinc(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.AUTOINC</code>.
	 */
	@Override
	public ULong getAutoinc() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.REF_COUNT</code>.
	 */
	@Override
	public void setRefCount(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.REF_COUNT</code>.
	 */
	@Override
	public Integer getRefCount() {
		return (Integer) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<ULong, String, String, ULong, ULong, ULong, ULong, ULong, Integer> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<ULong, String, String, ULong, ULong, ULong, ULong, ULong, Integer> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return InnodbSysTablestats.INNODB_SYS_TABLESTATS.TABLE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InnodbSysTablestats.INNODB_SYS_TABLESTATS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return InnodbSysTablestats.INNODB_SYS_TABLESTATS.STATS_INITIALIZED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return InnodbSysTablestats.INNODB_SYS_TABLESTATS.NUM_ROWS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return InnodbSysTablestats.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return InnodbSysTablestats.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field7() {
		return InnodbSysTablestats.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field8() {
		return InnodbSysTablestats.INNODB_SYS_TABLESTATS.AUTOINC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return InnodbSysTablestats.INNODB_SYS_TABLESTATS.REF_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getTableId();
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
	public String value3() {
		return getStatsInitialized();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getNumRows();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getClustIndexSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getOtherIndexSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value7() {
		return getModifiedCounter();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value8() {
		return getAutoinc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getRefCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord value1(ULong value) {
		setTableId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord value3(String value) {
		setStatsInitialized(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord value4(ULong value) {
		setNumRows(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord value5(ULong value) {
		setClustIndexSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord value6(ULong value) {
		setOtherIndexSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord value7(ULong value) {
		setModifiedCounter(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord value8(ULong value) {
		setAutoinc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord value9(Integer value) {
		setRefCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablestatsRecord values(ULong value1, String value2, String value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, Integer value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IInnodbSysTablestats from) {
		setTableId(from.getTableId());
		setName(from.getName());
		setStatsInitialized(from.getStatsInitialized());
		setNumRows(from.getNumRows());
		setClustIndexSize(from.getClustIndexSize());
		setOtherIndexSize(from.getOtherIndexSize());
		setModifiedCounter(from.getModifiedCounter());
		setAutoinc(from.getAutoinc());
		setRefCount(from.getRefCount());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbSysTablestats> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbSysTablestatsRecord
	 */
	public InnodbSysTablestatsRecord() {
		super(InnodbSysTablestats.INNODB_SYS_TABLESTATS);
	}

	/**
	 * Create a detached, initialised InnodbSysTablestatsRecord
	 */
	public InnodbSysTablestatsRecord(ULong tableId, String name, String statsInitialized, ULong numRows, ULong clustIndexSize, ULong otherIndexSize, ULong modifiedCounter, ULong autoinc, Integer refCount) {
		super(InnodbSysTablestats.INNODB_SYS_TABLESTATS);

		setValue(0, tableId);
		setValue(1, name);
		setValue(2, statsInitialized);
		setValue(3, numRows);
		setValue(4, clustIndexSize);
		setValue(5, otherIndexSize);
		setValue(6, modifiedCounter);
		setValue(7, autoinc);
		setValue(8, refCount);
	}
}
