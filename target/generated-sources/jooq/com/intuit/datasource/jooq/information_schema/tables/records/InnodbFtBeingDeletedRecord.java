/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.InnodbFtBeingDeleted;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbFtBeingDeleted;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class InnodbFtBeingDeletedRecord extends TableRecordImpl<InnodbFtBeingDeletedRecord> implements Record1<ULong>, IInnodbFtBeingDeleted {

	private static final long serialVersionUID = 1035624108;

	/**
	 * Setter for <code>information_schema.INNODB_FT_BEING_DELETED.DOC_ID</code>.
	 */
	@Override
	public void setDocId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_BEING_DELETED.DOC_ID</code>.
	 */
	@Override
	public ULong getDocId() {
		return (ULong) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<ULong> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<ULong> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED.DOC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getDocId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtBeingDeletedRecord value1(ULong value) {
		setDocId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtBeingDeletedRecord values(ULong value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IInnodbFtBeingDeleted from) {
		setDocId(from.getDocId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbFtBeingDeleted> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbFtBeingDeletedRecord
	 */
	public InnodbFtBeingDeletedRecord() {
		super(InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED);
	}

	/**
	 * Create a detached, initialised InnodbFtBeingDeletedRecord
	 */
	public InnodbFtBeingDeletedRecord(ULong docId) {
		super(InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED);

		setValue(0, docId);
	}
}
