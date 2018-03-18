/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.pojos;


import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbSysForeign;

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
public class InnodbSysForeign implements IInnodbSysForeign {

	private static final long serialVersionUID = 927845884;

	private String   id;
	private String   forName;
	private String   refName;
	private UInteger nCols;
	private UInteger type;

	public InnodbSysForeign() {}

	public InnodbSysForeign(InnodbSysForeign value) {
		this.id = value.id;
		this.forName = value.forName;
		this.refName = value.refName;
		this.nCols = value.nCols;
		this.type = value.type;
	}

	public InnodbSysForeign(
		String   id,
		String   forName,
		String   refName,
		UInteger nCols,
		UInteger type
	) {
		this.id = id;
		this.forName = forName;
		this.refName = refName;
		this.nCols = nCols;
		this.type = type;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getForName() {
		return this.forName;
	}

	@Override
	public void setForName(String forName) {
		this.forName = forName;
	}

	@Override
	public String getRefName() {
		return this.refName;
	}

	@Override
	public void setRefName(String refName) {
		this.refName = refName;
	}

	@Override
	public UInteger getNCols() {
		return this.nCols;
	}

	@Override
	public void setNCols(UInteger nCols) {
		this.nCols = nCols;
	}

	@Override
	public UInteger getType() {
		return this.type;
	}

	@Override
	public void setType(UInteger type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("InnodbSysForeign (");

		sb.append(id);
		sb.append(", ").append(forName);
		sb.append(", ").append(refName);
		sb.append(", ").append(nCols);
		sb.append(", ").append(type);

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
	public void from(IInnodbSysForeign from) {
		setId(from.getId());
		setForName(from.getForName());
		setRefName(from.getRefName());
		setNCols(from.getNCols());
		setType(from.getType());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbSysForeign> E into(E into) {
		into.from(this);
		return into;
	}
}
