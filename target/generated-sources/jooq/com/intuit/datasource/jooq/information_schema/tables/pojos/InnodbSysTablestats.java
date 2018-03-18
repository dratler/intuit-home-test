/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.pojos;


import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysTablestats;

import javax.annotation.Generated;

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
public class InnodbSysTablestats implements IInnodbSysTablestats {

	private static final long serialVersionUID = 873574011;

	private ULong   tableId;
	private String  name;
	private String  statsInitialized;
	private ULong   numRows;
	private ULong   clustIndexSize;
	private ULong   otherIndexSize;
	private ULong   modifiedCounter;
	private ULong   autoinc;
	private Integer refCount;

	public InnodbSysTablestats() {}

	public InnodbSysTablestats(InnodbSysTablestats value) {
		this.tableId = value.tableId;
		this.name = value.name;
		this.statsInitialized = value.statsInitialized;
		this.numRows = value.numRows;
		this.clustIndexSize = value.clustIndexSize;
		this.otherIndexSize = value.otherIndexSize;
		this.modifiedCounter = value.modifiedCounter;
		this.autoinc = value.autoinc;
		this.refCount = value.refCount;
	}

	public InnodbSysTablestats(
		ULong   tableId,
		String  name,
		String  statsInitialized,
		ULong   numRows,
		ULong   clustIndexSize,
		ULong   otherIndexSize,
		ULong   modifiedCounter,
		ULong   autoinc,
		Integer refCount
	) {
		this.tableId = tableId;
		this.name = name;
		this.statsInitialized = statsInitialized;
		this.numRows = numRows;
		this.clustIndexSize = clustIndexSize;
		this.otherIndexSize = otherIndexSize;
		this.modifiedCounter = modifiedCounter;
		this.autoinc = autoinc;
		this.refCount = refCount;
	}

	@Override
	public ULong getTableId() {
		return this.tableId;
	}

	@Override
	public void setTableId(ULong tableId) {
		this.tableId = tableId;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getStatsInitialized() {
		return this.statsInitialized;
	}

	@Override
	public void setStatsInitialized(String statsInitialized) {
		this.statsInitialized = statsInitialized;
	}

	@Override
	public ULong getNumRows() {
		return this.numRows;
	}

	@Override
	public void setNumRows(ULong numRows) {
		this.numRows = numRows;
	}

	@Override
	public ULong getClustIndexSize() {
		return this.clustIndexSize;
	}

	@Override
	public void setClustIndexSize(ULong clustIndexSize) {
		this.clustIndexSize = clustIndexSize;
	}

	@Override
	public ULong getOtherIndexSize() {
		return this.otherIndexSize;
	}

	@Override
	public void setOtherIndexSize(ULong otherIndexSize) {
		this.otherIndexSize = otherIndexSize;
	}

	@Override
	public ULong getModifiedCounter() {
		return this.modifiedCounter;
	}

	@Override
	public void setModifiedCounter(ULong modifiedCounter) {
		this.modifiedCounter = modifiedCounter;
	}

	@Override
	public ULong getAutoinc() {
		return this.autoinc;
	}

	@Override
	public void setAutoinc(ULong autoinc) {
		this.autoinc = autoinc;
	}

	@Override
	public Integer getRefCount() {
		return this.refCount;
	}

	@Override
	public void setRefCount(Integer refCount) {
		this.refCount = refCount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("InnodbSysTablestats (");

		sb.append(tableId);
		sb.append(", ").append(name);
		sb.append(", ").append(statsInitialized);
		sb.append(", ").append(numRows);
		sb.append(", ").append(clustIndexSize);
		sb.append(", ").append(otherIndexSize);
		sb.append(", ").append(modifiedCounter);
		sb.append(", ").append(autoinc);
		sb.append(", ").append(refCount);

		sb.append(")");
		return sb.toString();
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
}
