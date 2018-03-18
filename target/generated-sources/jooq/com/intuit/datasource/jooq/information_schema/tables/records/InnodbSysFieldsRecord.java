/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.InnodbSysFields;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysFields;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class InnodbSysFieldsRecord extends TableRecordImpl<InnodbSysFieldsRecord> implements Record3<ULong, String, UInteger>, IInnodbSysFields {

	private static final long serialVersionUID = -1534830286;

	/**
	 * Setter for <code>information_schema.INNODB_SYS_FIELDS.INDEX_ID</code>.
	 */
	@Override
	public void setIndexId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_FIELDS.INDEX_ID</code>.
	 */
	@Override
	public ULong getIndexId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_FIELDS.NAME</code>.
	 */
	@Override
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_FIELDS.NAME</code>.
	 */
	@Override
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_FIELDS.POS</code>.
	 */
	@Override
	public void setPos(UInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_FIELDS.POS</code>.
	 */
	@Override
	public UInteger getPos() {
		return (UInteger) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<ULong, String, UInteger> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<ULong, String, UInteger> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return InnodbSysFields.INNODB_SYS_FIELDS.INDEX_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InnodbSysFields.INNODB_SYS_FIELDS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field3() {
		return InnodbSysFields.INNODB_SYS_FIELDS.POS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getIndexId();
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
		return getPos();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysFieldsRecord value1(ULong value) {
		setIndexId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysFieldsRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysFieldsRecord value3(UInteger value) {
		setPos(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysFieldsRecord values(ULong value1, String value2, UInteger value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IInnodbSysFields from) {
		setIndexId(from.getIndexId());
		setName(from.getName());
		setPos(from.getPos());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbSysFields> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbSysFieldsRecord
	 */
	public InnodbSysFieldsRecord() {
		super(InnodbSysFields.INNODB_SYS_FIELDS);
	}

	/**
	 * Create a detached, initialised InnodbSysFieldsRecord
	 */
	public InnodbSysFieldsRecord(ULong indexId, String name, UInteger pos) {
		super(InnodbSysFields.INNODB_SYS_FIELDS);

		setValue(0, indexId);
		setValue(1, name);
		setValue(2, pos);
	}
}
