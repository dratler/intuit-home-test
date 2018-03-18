/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.pojos;


import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysDatafiles;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class InnodbSysDatafiles implements IInnodbSysDatafiles {

	private static final long serialVersionUID = 897204083;

	private UInteger space;
	private String   path;

	public InnodbSysDatafiles() {}

	public InnodbSysDatafiles(InnodbSysDatafiles value) {
		this.space = value.space;
		this.path = value.path;
	}

	public InnodbSysDatafiles(
		UInteger space,
		String   path
	) {
		this.space = space;
		this.path = path;
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
	public String getPath() {
		return this.path;
	}

	@Override
	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("InnodbSysDatafiles (");

		sb.append(space);
		sb.append(", ").append(path);

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
	public void from(IInnodbSysDatafiles from) {
		setSpace(from.getSpace());
		setPath(from.getPath());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbSysDatafiles> E into(E into) {
		into.from(this);
		return into;
	}
}
