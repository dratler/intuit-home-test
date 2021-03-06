/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.pojos;


import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbCmpReset;

import javax.annotation.Generated;


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
public class InnodbCmpReset implements IInnodbCmpReset {

	private static final long serialVersionUID = -1375736189;

	private Integer pageSize;
	private Integer compressOps;
	private Integer compressOpsOk;
	private Integer compressTime;
	private Integer uncompressOps;
	private Integer uncompressTime;

	public InnodbCmpReset() {}

	public InnodbCmpReset(InnodbCmpReset value) {
		this.pageSize = value.pageSize;
		this.compressOps = value.compressOps;
		this.compressOpsOk = value.compressOpsOk;
		this.compressTime = value.compressTime;
		this.uncompressOps = value.uncompressOps;
		this.uncompressTime = value.uncompressTime;
	}

	public InnodbCmpReset(
		Integer pageSize,
		Integer compressOps,
		Integer compressOpsOk,
		Integer compressTime,
		Integer uncompressOps,
		Integer uncompressTime
	) {
		this.pageSize = pageSize;
		this.compressOps = compressOps;
		this.compressOpsOk = compressOpsOk;
		this.compressTime = compressTime;
		this.uncompressOps = uncompressOps;
		this.uncompressTime = uncompressTime;
	}

	@Override
	public Integer getPageSize() {
		return this.pageSize;
	}

	@Override
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public Integer getCompressOps() {
		return this.compressOps;
	}

	@Override
	public void setCompressOps(Integer compressOps) {
		this.compressOps = compressOps;
	}

	@Override
	public Integer getCompressOpsOk() {
		return this.compressOpsOk;
	}

	@Override
	public void setCompressOpsOk(Integer compressOpsOk) {
		this.compressOpsOk = compressOpsOk;
	}

	@Override
	public Integer getCompressTime() {
		return this.compressTime;
	}

	@Override
	public void setCompressTime(Integer compressTime) {
		this.compressTime = compressTime;
	}

	@Override
	public Integer getUncompressOps() {
		return this.uncompressOps;
	}

	@Override
	public void setUncompressOps(Integer uncompressOps) {
		this.uncompressOps = uncompressOps;
	}

	@Override
	public Integer getUncompressTime() {
		return this.uncompressTime;
	}

	@Override
	public void setUncompressTime(Integer uncompressTime) {
		this.uncompressTime = uncompressTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("InnodbCmpReset (");

		sb.append(pageSize);
		sb.append(", ").append(compressOps);
		sb.append(", ").append(compressOpsOk);
		sb.append(", ").append(compressTime);
		sb.append(", ").append(uncompressOps);
		sb.append(", ").append(uncompressTime);

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
	public void from(IInnodbCmpReset from) {
		setPageSize(from.getPageSize());
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
	public <E extends IInnodbCmpReset> E into(E into) {
		into.from(this);
		return into;
	}
}
