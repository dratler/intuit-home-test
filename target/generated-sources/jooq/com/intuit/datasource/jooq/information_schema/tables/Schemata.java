/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables;


import com.intuit.datasource.jooq.information_schema.InformationSchema;
import com.intuit.datasource.jooq.information_schema.tables.records.SchemataRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class Schemata extends TableImpl<SchemataRecord> {

	private static final long serialVersionUID = -205828404;

	/**
	 * The reference instance of <code>information_schema.SCHEMATA</code>
	 */
	public static final Schemata SCHEMATA = new Schemata();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SchemataRecord> getRecordType() {
		return SchemataRecord.class;
	}

	/**
	 * The column <code>information_schema.SCHEMATA.CATALOG_NAME</code>.
	 */
	public final TableField<SchemataRecord, String> CATALOG_NAME = createField("CATALOG_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMATA.SCHEMA_NAME</code>.
	 */
	public final TableField<SchemataRecord, String> SCHEMA_NAME = createField("SCHEMA_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
	 */
	public final TableField<SchemataRecord, String> DEFAULT_CHARACTER_SET_NAME = createField("DEFAULT_CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
	 */
	public final TableField<SchemataRecord, String> DEFAULT_COLLATION_NAME = createField("DEFAULT_COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.SCHEMATA.SQL_PATH</code>.
	 */
	public final TableField<SchemataRecord, String> SQL_PATH = createField("SQL_PATH", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * Create a <code>information_schema.SCHEMATA</code> table reference
	 */
	public Schemata() {
		this("SCHEMATA", null);
	}

	/**
	 * Create an aliased <code>information_schema.SCHEMATA</code> table reference
	 */
	public Schemata(String alias) {
		this(alias, SCHEMATA);
	}

	private Schemata(String alias, Table<SchemataRecord> aliased) {
		this(alias, aliased, null);
	}

	private Schemata(String alias, Table<SchemataRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schemata as(String alias) {
		return new Schemata(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Schemata rename(String name) {
		return new Schemata(name, null);
	}
}
