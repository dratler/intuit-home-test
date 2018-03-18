/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.pojos;


import com.intuit.datasource.jooq.information_schema.tables.interfaces.IInnodbFtDeleted;

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
public class InnodbFtDeleted implements IInnodbFtDeleted {

	private static final long serialVersionUID = 74260933;

	private ULong docId;

	public InnodbFtDeleted() {}

	public InnodbFtDeleted(InnodbFtDeleted value) {
		this.docId = value.docId;
	}

	public InnodbFtDeleted(
		ULong docId
	) {
		this.docId = docId;
	}

	@Override
	public ULong getDocId() {
		return this.docId;
	}

	@Override
	public void setDocId(ULong docId) {
		this.docId = docId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("InnodbFtDeleted (");

		sb.append(docId);

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
	public void from(IInnodbFtDeleted from) {
		setDocId(from.getDocId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IInnodbFtDeleted> E into(E into) {
		into.from(this);
		return into;
	}
}