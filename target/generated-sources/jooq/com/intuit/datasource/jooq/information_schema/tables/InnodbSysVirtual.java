/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables;


import com.intuit.datasource.jooq.information_schema.InformationSchema;
import com.intuit.datasource.jooq.information_schema.tables.records.InnodbSysVirtualRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class InnodbSysVirtual extends TableImpl<InnodbSysVirtualRecord> {

	private static final long serialVersionUID = 1934790913;

	/**
	 * The reference instance of <code>information_schema.INNODB_SYS_VIRTUAL</code>
	 */
	public static final InnodbSysVirtual INNODB_SYS_VIRTUAL = new InnodbSysVirtual();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbSysVirtualRecord> getRecordType() {
		return InnodbSysVirtualRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_SYS_VIRTUAL.TABLE_ID</code>.
	 */
	public final TableField<InnodbSysVirtualRecord, ULong> TABLE_ID = createField("TABLE_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_VIRTUAL.POS</code>.
	 */
	public final TableField<InnodbSysVirtualRecord, UInteger> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_VIRTUAL.BASE_POS</code>.
	 */
	public final TableField<InnodbSysVirtualRecord, UInteger> BASE_POS = createField("BASE_POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_SYS_VIRTUAL</code> table reference
	 */
	public InnodbSysVirtual() {
		this("INNODB_SYS_VIRTUAL", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_SYS_VIRTUAL</code> table reference
	 */
	public InnodbSysVirtual(String alias) {
		this(alias, INNODB_SYS_VIRTUAL);
	}

	private InnodbSysVirtual(String alias, Table<InnodbSysVirtualRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbSysVirtual(String alias, Table<InnodbSysVirtualRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysVirtual as(String alias) {
		return new InnodbSysVirtual(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbSysVirtual rename(String name) {
		return new InnodbSysVirtual(name, null);
	}
}
