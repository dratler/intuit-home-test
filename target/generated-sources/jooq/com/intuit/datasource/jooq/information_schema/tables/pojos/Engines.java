/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.pojos;


import com.intuit.datasource.jooq.information_schema.tables.interfaces.IEngines;

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
public class Engines implements IEngines {

	private static final long serialVersionUID = -1900541739;

	private String engine;
	private String support;
	private String comment;
	private String transactions;
	private String xa;
	private String savepoints;

	public Engines() {}

	public Engines(Engines value) {
		this.engine = value.engine;
		this.support = value.support;
		this.comment = value.comment;
		this.transactions = value.transactions;
		this.xa = value.xa;
		this.savepoints = value.savepoints;
	}

	public Engines(
		String engine,
		String support,
		String comment,
		String transactions,
		String xa,
		String savepoints
	) {
		this.engine = engine;
		this.support = support;
		this.comment = comment;
		this.transactions = transactions;
		this.xa = xa;
		this.savepoints = savepoints;
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String getSupport() {
		return this.support;
	}

	@Override
	public void setSupport(String support) {
		this.support = support;
	}

	@Override
	public String getComment() {
		return this.comment;
	}

	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String getTransactions() {
		return this.transactions;
	}

	@Override
	public void setTransactions(String transactions) {
		this.transactions = transactions;
	}

	@Override
	public String getXa() {
		return this.xa;
	}

	@Override
	public void setXa(String xa) {
		this.xa = xa;
	}

	@Override
	public String getSavepoints() {
		return this.savepoints;
	}

	@Override
	public void setSavepoints(String savepoints) {
		this.savepoints = savepoints;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Engines (");

		sb.append(engine);
		sb.append(", ").append(support);
		sb.append(", ").append(comment);
		sb.append(", ").append(transactions);
		sb.append(", ").append(xa);
		sb.append(", ").append(savepoints);

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
	public void from(IEngines from) {
		setEngine(from.getEngine());
		setSupport(from.getSupport());
		setComment(from.getComment());
		setTransactions(from.getTransactions());
		setXa(from.getXa());
		setSavepoints(from.getSavepoints());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IEngines> E into(E into) {
		into.from(this);
		return into;
	}
}
