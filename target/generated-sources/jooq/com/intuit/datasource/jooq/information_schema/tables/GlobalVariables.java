/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables;


import com.intuit.datasource.jooq.information_schema.InformationSchema;
import com.intuit.datasource.jooq.information_schema.tables.records.GlobalVariablesRecord;

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
public class GlobalVariables extends TableImpl<GlobalVariablesRecord> {

	private static final long serialVersionUID = 1734062813;

	/**
	 * The reference instance of <code>information_schema.GLOBAL_VARIABLES</code>
	 */
	public static final GlobalVariables GLOBAL_VARIABLES = new GlobalVariables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<GlobalVariablesRecord> getRecordType() {
		return GlobalVariablesRecord.class;
	}

	/**
	 * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
	 */
	public final TableField<GlobalVariablesRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
	 */
	public final TableField<GlobalVariablesRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * Create a <code>information_schema.GLOBAL_VARIABLES</code> table reference
	 */
	public GlobalVariables() {
		this("GLOBAL_VARIABLES", null);
	}

	/**
	 * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
	 */
	public GlobalVariables(String alias) {
		this(alias, GLOBAL_VARIABLES);
	}

	private GlobalVariables(String alias, Table<GlobalVariablesRecord> aliased) {
		this(alias, aliased, null);
	}

	private GlobalVariables(String alias, Table<GlobalVariablesRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GlobalVariables as(String alias) {
		return new GlobalVariables(alias, this);
	}

	/**
	 * Rename this table
	 */
	public GlobalVariables rename(String name) {
		return new GlobalVariables(name, null);
	}
}
