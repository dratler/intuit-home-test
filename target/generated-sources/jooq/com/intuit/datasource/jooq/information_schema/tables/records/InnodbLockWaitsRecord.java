/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.InnodbLockWaits;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbLockWaits;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class InnodbLockWaitsRecord extends TableRecordImpl<InnodbLockWaitsRecord> implements Record4<String, String, String, String>, IInnodbLockWaits {

	private static final long serialVersionUID = -229800592;

	/**
	 * Setter for <code>information_schema.INNODB_LOCK_WAITS.requesting_trx_id</code>.
	 */
	@Override
	public void setRequestingTrxId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCK_WAITS.requesting_trx_id</code>.
	 */
	@Override
	public String getRequestingTrxId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCK_WAITS.requested_lock_id</code>.
	 */
	@Override
	public void setRequestedLockId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCK_WAITS.requested_lock_id</code>.
	 */
	@Override
	public String getRequestedLockId() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCK_WAITS.blocking_trx_id</code>.
	 */
	@Override
	public void setBlockingTrxId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCK_WAITS.blocking_trx_id</code>.
	 */
	@Override
	public String getBlockingTrxId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_LOCK_WAITS.blocking_lock_id</code>.
	 */
	@Override
	public void setBlockingLockId(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_LOCK_WAITS.blocking_lock_id</code>.
	 */
	@Override
	public String getBlockingLockId() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return InnodbLockWaits.INNODB_LOCK_WAITS.REQUESTING_TRX_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InnodbLockWaits.INNODB_LOCK_WAITS.REQUESTED_LOCK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return InnodbLockWaits.INNODB_LOCK_WAITS.BLOCKING_TRX_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return InnodbLockWaits.INNODB_LOCK_WAITS.BLOCKING_LOCK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getRequestingTrxId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getRequestedLockId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBlockingTrxId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getBlockingLockId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLockWaitsRecord value1(String value) {
		setRequestingTrxId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLockWaitsRecord value2(String value) {
		setRequestedLockId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLockWaitsRecord value3(String value) {
		setBlockingTrxId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLockWaitsRecord value4(String value) {
		setBlockingLockId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbLockWaitsRecord values(String value1, String value2, String value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IInnodbLockWaits from) {
		setRequestingTrxId(from.getRequestingTrxId());
		setRequestedLockId(from.getRequestedLockId());
		setBlockingTrxId(from.getBlockingTrxId());
		setBlockingLockId(from.getBlockingLockId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbLockWaits> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbLockWaitsRecord
	 */
	public InnodbLockWaitsRecord() {
		super(InnodbLockWaits.INNODB_LOCK_WAITS);
	}

	/**
	 * Create a detached, initialised InnodbLockWaitsRecord
	 */
	public InnodbLockWaitsRecord(String requestingTrxId, String requestedLockId, String blockingTrxId, String blockingLockId) {
		super(InnodbLockWaits.INNODB_LOCK_WAITS);

		setValue(0, requestingTrxId);
		setValue(1, requestedLockId);
		setValue(2, blockingTrxId);
		setValue(3, blockingLockId);
	}
}
