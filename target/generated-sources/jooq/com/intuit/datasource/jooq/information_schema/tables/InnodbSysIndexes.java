/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables;


import com.intuit.datasource.jooq.information_schema.InformationSchema;
import com.intuit.datasource.jooq.information_schema.tables.records.InnodbSysIndexesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class InnodbSysIndexes extends TableImpl<InnodbSysIndexesRecord> {

	private static final long serialVersionUID = 154011912;

	/**
	 * The reference instance of <code>information_schema.INNODB_SYS_INDEXES</code>
	 */
	public static final InnodbSysIndexes INNODB_SYS_INDEXES = new InnodbSysIndexes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbSysIndexesRecord> getRecordType() {
		return InnodbSysIndexesRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_SYS_INDEXES.INDEX_ID</code>.
	 */
	public final TableField<InnodbSysIndexesRecord, ULong> INDEX_ID = createField("INDEX_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_INDEXES.NAME</code>.
	 */
	public final TableField<InnodbSysIndexesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_INDEXES.TABLE_ID</code>.
	 */
	public final TableField<InnodbSysIndexesRecord, ULong> TABLE_ID = createField("TABLE_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_INDEXES.TYPE</code>.
	 */
	public final TableField<InnodbSysIndexesRecord, Integer> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_INDEXES.N_FIELDS</code>.
	 */
	public final TableField<InnodbSysIndexesRecord, Integer> N_FIELDS = createField("N_FIELDS", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_INDEXES.PAGE_NO</code>.
	 */
	public final TableField<InnodbSysIndexesRecord, Integer> PAGE_NO = createField("PAGE_NO", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_INDEXES.SPACE</code>.
	 */
	public final TableField<InnodbSysIndexesRecord, Integer> SPACE = createField("SPACE", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_INDEXES.MERGE_THRESHOLD</code>.
	 */
	public final TableField<InnodbSysIndexesRecord, Integer> MERGE_THRESHOLD = createField("MERGE_THRESHOLD", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_SYS_INDEXES</code> table reference
	 */
	public InnodbSysIndexes() {
		this("INNODB_SYS_INDEXES", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_SYS_INDEXES</code> table reference
	 */
	public InnodbSysIndexes(String alias) {
		this(alias, INNODB_SYS_INDEXES);
	}

	private InnodbSysIndexes(String alias, Table<InnodbSysIndexesRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbSysIndexes(String alias, Table<InnodbSysIndexesRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysIndexes as(String alias) {
		return new InnodbSysIndexes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbSysIndexes rename(String name) {
		return new InnodbSysIndexes(name, null);
	}
}
