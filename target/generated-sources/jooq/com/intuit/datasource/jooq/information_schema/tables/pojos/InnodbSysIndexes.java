/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.pojos;


import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysIndexes;

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
public class InnodbSysIndexes implements IInnodbSysIndexes {

	private static final long serialVersionUID = 640380807;

	private ULong   indexId;
	private String  name;
	private ULong   tableId;
	private Integer type;
	private Integer nFields;
	private Integer pageNo;
	private Integer space;
	private Integer mergeThreshold;

	public InnodbSysIndexes() {}

	public InnodbSysIndexes(InnodbSysIndexes value) {
		this.indexId = value.indexId;
		this.name = value.name;
		this.tableId = value.tableId;
		this.type = value.type;
		this.nFields = value.nFields;
		this.pageNo = value.pageNo;
		this.space = value.space;
		this.mergeThreshold = value.mergeThreshold;
	}

	public InnodbSysIndexes(
		ULong   indexId,
		String  name,
		ULong   tableId,
		Integer type,
		Integer nFields,
		Integer pageNo,
		Integer space,
		Integer mergeThreshold
	) {
		this.indexId = indexId;
		this.name = name;
		this.tableId = tableId;
		this.type = type;
		this.nFields = nFields;
		this.pageNo = pageNo;
		this.space = space;
		this.mergeThreshold = mergeThreshold;
	}

	@Override
	public ULong getIndexId() {
		return this.indexId;
	}

	@Override
	public void setIndexId(ULong indexId) {
		this.indexId = indexId;
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
	public ULong getTableId() {
		return this.tableId;
	}

	@Override
	public void setTableId(ULong tableId) {
		this.tableId = tableId;
	}

	@Override
	public Integer getType() {
		return this.type;
	}

	@Override
	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public Integer getNFields() {
		return this.nFields;
	}

	@Override
	public void setNFields(Integer nFields) {
		this.nFields = nFields;
	}

	@Override
	public Integer getPageNo() {
		return this.pageNo;
	}

	@Override
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	@Override
	public Integer getSpace() {
		return this.space;
	}

	@Override
	public void setSpace(Integer space) {
		this.space = space;
	}

	@Override
	public Integer getMergeThreshold() {
		return this.mergeThreshold;
	}

	@Override
	public void setMergeThreshold(Integer mergeThreshold) {
		this.mergeThreshold = mergeThreshold;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("InnodbSysIndexes (");

		sb.append(indexId);
		sb.append(", ").append(name);
		sb.append(", ").append(tableId);
		sb.append(", ").append(type);
		sb.append(", ").append(nFields);
		sb.append(", ").append(pageNo);
		sb.append(", ").append(space);
		sb.append(", ").append(mergeThreshold);

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
	public void from(IInnodbSysIndexes from) {
		setIndexId(from.getIndexId());
		setName(from.getName());
		setTableId(from.getTableId());
		setType(from.getType());
		setNFields(from.getNFields());
		setPageNo(from.getPageNo());
		setSpace(from.getSpace());
		setMergeThreshold(from.getMergeThreshold());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbSysIndexes> E into(E into) {
		into.from(this);
		return into;
	}
}
