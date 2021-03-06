/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.InnodbCmpPerIndex;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbCmpPerIndex;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class InnodbCmpPerIndexRecord extends TableRecordImpl<InnodbCmpPerIndexRecord> implements Record8<String, String, String, Integer, Integer, Integer, Integer, Integer>, IInnodbCmpPerIndex {

	private static final long serialVersionUID = -1871757955;

	/**
	 * Setter for <code>information_schema.INNODB_CMP_PER_INDEX.database_name</code>.
	 */
	@Override
	public void setDatabaseName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMP_PER_INDEX.database_name</code>.
	 */
	@Override
	public String getDatabaseName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMP_PER_INDEX.table_name</code>.
	 */
	@Override
	public void setTableName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMP_PER_INDEX.table_name</code>.
	 */
	@Override
	public String getTableName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMP_PER_INDEX.index_name</code>.
	 */
	@Override
	public void setIndexName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMP_PER_INDEX.index_name</code>.
	 */
	@Override
	public String getIndexName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops</code>.
	 */
	@Override
	public void setCompressOps(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops</code>.
	 */
	@Override
	public Integer getCompressOps() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops_ok</code>.
	 */
	@Override
	public void setCompressOpsOk(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMP_PER_INDEX.compress_ops_ok</code>.
	 */
	@Override
	public Integer getCompressOpsOk() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMP_PER_INDEX.compress_time</code>.
	 */
	@Override
	public void setCompressTime(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMP_PER_INDEX.compress_time</code>.
	 */
	@Override
	public Integer getCompressTime() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_ops</code>.
	 */
	@Override
	public void setUncompressOps(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_ops</code>.
	 */
	@Override
	public Integer getUncompressOps() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_time</code>.
	 */
	@Override
	public void setUncompressTime(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMP_PER_INDEX.uncompress_time</code>.
	 */
	@Override
	public Integer getUncompressTime() {
		return (Integer) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, Integer, Integer, Integer, Integer, Integer> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.DATABASE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.COMPRESS_OPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.COMPRESS_OPS_OK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.COMPRESS_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.UNCOMPRESS_OPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return InnodbCmpPerIndex.INNODB_CMP_PER_INDEX.UNCOMPRESS_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getDatabaseName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getIndexName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getCompressOps();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getCompressOpsOk();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getCompressTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getUncompressOps();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getUncompressTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndexRecord value1(String value) {
		setDatabaseName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndexRecord value2(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndexRecord value3(String value) {
		setIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndexRecord value4(Integer value) {
		setCompressOps(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndexRecord value5(Integer value) {
		setCompressOpsOk(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndexRecord value6(Integer value) {
		setCompressTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndexRecord value7(Integer value) {
		setUncompressOps(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndexRecord value8(Integer value) {
		setUncompressTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpPerIndexRecord values(String value1, String value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IInnodbCmpPerIndex from) {
		setDatabaseName(from.getDatabaseName());
		setTableName(from.getTableName());
		setIndexName(from.getIndexName());
		setCompressOps(from.getCompressOps());
		setCompressOpsOk(from.getCompressOpsOk());
		setCompressTime(from.getCompressTime());
		setUncompressOps(from.getUncompressOps());
		setUncompressTime(from.getUncompressTime());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbCmpPerIndex> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbCmpPerIndexRecord
	 */
	public InnodbCmpPerIndexRecord() {
		super(InnodbCmpPerIndex.INNODB_CMP_PER_INDEX);
	}

	/**
	 * Create a detached, initialised InnodbCmpPerIndexRecord
	 */
	public InnodbCmpPerIndexRecord(String databaseName, String tableName, String indexName, Integer compressOps, Integer compressOpsOk, Integer compressTime, Integer uncompressOps, Integer uncompressTime) {
		super(InnodbCmpPerIndex.INNODB_CMP_PER_INDEX);

		setValue(0, databaseName);
		setValue(1, tableName);
		setValue(2, indexName);
		setValue(3, compressOps);
		setValue(4, compressOpsOk);
		setValue(5, compressTime);
		setValue(6, uncompressOps);
		setValue(7, uncompressTime);
	}
}
