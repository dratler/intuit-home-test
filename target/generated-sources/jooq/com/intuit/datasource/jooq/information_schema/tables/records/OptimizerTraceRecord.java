/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.OptimizerTrace;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IOptimizerTrace;

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
public class OptimizerTraceRecord extends TableRecordImpl<OptimizerTraceRecord> implements Record4<String, String, Integer, Byte>, IOptimizerTrace {

	private static final long serialVersionUID = -802330717;

	/**
	 * Setter for <code>information_schema.OPTIMIZER_TRACE.QUERY</code>.
	 */
	@Override
	public void setQuery(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.OPTIMIZER_TRACE.QUERY</code>.
	 */
	@Override
	public String getQuery() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.OPTIMIZER_TRACE.TRACE</code>.
	 */
	@Override
	public void setTrace(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.OPTIMIZER_TRACE.TRACE</code>.
	 */
	@Override
	public String getTrace() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE</code>.
	 */
	@Override
	public void setMissingBytesBeyondMaxMemSize(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE</code>.
	 */
	@Override
	public Integer getMissingBytesBeyondMaxMemSize() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES</code>.
	 */
	@Override
	public void setInsufficientPrivileges(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES</code>.
	 */
	@Override
	public Byte getInsufficientPrivileges() {
		return (Byte) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, Integer, Byte> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, Integer, Byte> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return OptimizerTrace.OPTIMIZER_TRACE.QUERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return OptimizerTrace.OPTIMIZER_TRACE.TRACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return OptimizerTrace.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field4() {
		return OptimizerTrace.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getQuery();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTrace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getMissingBytesBeyondMaxMemSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value4() {
		return getInsufficientPrivileges();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OptimizerTraceRecord value1(String value) {
		setQuery(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OptimizerTraceRecord value2(String value) {
		setTrace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OptimizerTraceRecord value3(Integer value) {
		setMissingBytesBeyondMaxMemSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OptimizerTraceRecord value4(Byte value) {
		setInsufficientPrivileges(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OptimizerTraceRecord values(String value1, String value2, Integer value3, Byte value4) {
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
	public void from(IOptimizerTrace from) {
		setQuery(from.getQuery());
		setTrace(from.getTrace());
		setMissingBytesBeyondMaxMemSize(from.getMissingBytesBeyondMaxMemSize());
		setInsufficientPrivileges(from.getInsufficientPrivileges());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IOptimizerTrace> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached OptimizerTraceRecord
	 */
	public OptimizerTraceRecord() {
		super(OptimizerTrace.OPTIMIZER_TRACE);
	}

	/**
	 * Create a detached, initialised OptimizerTraceRecord
	 */
	public OptimizerTraceRecord(String query, String trace, Integer missingBytesBeyondMaxMemSize, Byte insufficientPrivileges) {
		super(OptimizerTrace.OPTIMIZER_TRACE);

		setValue(0, query);
		setValue(1, trace);
		setValue(2, missingBytesBeyondMaxMemSize);
		setValue(3, insufficientPrivileges);
	}
}
