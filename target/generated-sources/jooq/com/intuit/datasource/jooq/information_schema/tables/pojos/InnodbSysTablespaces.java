/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.pojos;


import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysTablespaces;

import javax.annotation.Generated;

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
public class InnodbSysTablespaces implements IInnodbSysTablespaces {

	private static final long serialVersionUID = 1186442481;

	private UInteger space;
	private String   name;
	private UInteger flag;
	private String   fileFormat;
	private String   rowFormat;
	private UInteger pageSize;
	private UInteger zipPageSize;
	private String   spaceType;
	private UInteger fsBlockSize;
	private ULong    fileSize;
	private ULong    allocatedSize;

	public InnodbSysTablespaces() {}

	public InnodbSysTablespaces(InnodbSysTablespaces value) {
		this.space = value.space;
		this.name = value.name;
		this.flag = value.flag;
		this.fileFormat = value.fileFormat;
		this.rowFormat = value.rowFormat;
		this.pageSize = value.pageSize;
		this.zipPageSize = value.zipPageSize;
		this.spaceType = value.spaceType;
		this.fsBlockSize = value.fsBlockSize;
		this.fileSize = value.fileSize;
		this.allocatedSize = value.allocatedSize;
	}

	public InnodbSysTablespaces(
		UInteger space,
		String   name,
		UInteger flag,
		String   fileFormat,
		String   rowFormat,
		UInteger pageSize,
		UInteger zipPageSize,
		String   spaceType,
		UInteger fsBlockSize,
		ULong    fileSize,
		ULong    allocatedSize
	) {
		this.space = space;
		this.name = name;
		this.flag = flag;
		this.fileFormat = fileFormat;
		this.rowFormat = rowFormat;
		this.pageSize = pageSize;
		this.zipPageSize = zipPageSize;
		this.spaceType = spaceType;
		this.fsBlockSize = fsBlockSize;
		this.fileSize = fileSize;
		this.allocatedSize = allocatedSize;
	}

	@Override
	public UInteger getSpace() {
		return this.space;
	}

	@Override
	public void setSpace(UInteger space) {
		this.space = space;
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
	public UInteger getFlag() {
		return this.flag;
	}

	@Override
	public void setFlag(UInteger flag) {
		this.flag = flag;
	}

	@Override
	public String getFileFormat() {
		return this.fileFormat;
	}

	@Override
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	@Override
	public String getRowFormat() {
		return this.rowFormat;
	}

	@Override
	public void setRowFormat(String rowFormat) {
		this.rowFormat = rowFormat;
	}

	@Override
	public UInteger getPageSize() {
		return this.pageSize;
	}

	@Override
	public void setPageSize(UInteger pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public UInteger getZipPageSize() {
		return this.zipPageSize;
	}

	@Override
	public void setZipPageSize(UInteger zipPageSize) {
		this.zipPageSize = zipPageSize;
	}

	@Override
	public String getSpaceType() {
		return this.spaceType;
	}

	@Override
	public void setSpaceType(String spaceType) {
		this.spaceType = spaceType;
	}

	@Override
	public UInteger getFsBlockSize() {
		return this.fsBlockSize;
	}

	@Override
	public void setFsBlockSize(UInteger fsBlockSize) {
		this.fsBlockSize = fsBlockSize;
	}

	@Override
	public ULong getFileSize() {
		return this.fileSize;
	}

	@Override
	public void setFileSize(ULong fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public ULong getAllocatedSize() {
		return this.allocatedSize;
	}

	@Override
	public void setAllocatedSize(ULong allocatedSize) {
		this.allocatedSize = allocatedSize;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("InnodbSysTablespaces (");

		sb.append(space);
		sb.append(", ").append(name);
		sb.append(", ").append(flag);
		sb.append(", ").append(fileFormat);
		sb.append(", ").append(rowFormat);
		sb.append(", ").append(pageSize);
		sb.append(", ").append(zipPageSize);
		sb.append(", ").append(spaceType);
		sb.append(", ").append(fsBlockSize);
		sb.append(", ").append(fileSize);
		sb.append(", ").append(allocatedSize);

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
}
