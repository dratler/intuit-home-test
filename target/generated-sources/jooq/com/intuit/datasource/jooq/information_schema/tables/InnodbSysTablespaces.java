/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables;


import com.intuit.datasource.jooq.information_schema.InformationSchema;
import com.intuit.datasource.jooq.information_schema.tables.records.InnodbSysTablespacesRecord;

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
public class InnodbSysTablespaces extends TableImpl<InnodbSysTablespacesRecord> {

	private static final long serialVersionUID = 192579940;

	/**
	 * The reference instance of <code>information_schema.INNODB_SYS_TABLESPACES</code>
	 */
	public static final InnodbSysTablespaces INNODB_SYS_TABLESPACES = new InnodbSysTablespaces();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbSysTablespacesRecord> getRecordType() {
		return InnodbSysTablespacesRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, UInteger> SPACE = createField("SPACE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(655).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, UInteger> FLAG = createField("FLAG", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.FILE_FORMAT</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, String> FILE_FORMAT = createField("FILE_FORMAT", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, String> ROW_FORMAT = createField("ROW_FORMAT", org.jooq.impl.SQLDataType.VARCHAR.length(22), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, UInteger> PAGE_SIZE = createField("PAGE_SIZE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, UInteger> ZIP_PAGE_SIZE = createField("ZIP_PAGE_SIZE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.SPACE_TYPE</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, String> SPACE_TYPE = createField("SPACE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.FS_BLOCK_SIZE</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, UInteger> FS_BLOCK_SIZE = createField("FS_BLOCK_SIZE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.FILE_SIZE</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, ULong> FILE_SIZE = createField("FILE_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_TABLESPACES.ALLOCATED_SIZE</code>.
	 */
	public final TableField<InnodbSysTablespacesRecord, ULong> ALLOCATED_SIZE = createField("ALLOCATED_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_SYS_TABLESPACES</code> table reference
	 */
	public InnodbSysTablespaces() {
		this("INNODB_SYS_TABLESPACES", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_SYS_TABLESPACES</code> table reference
	 */
	public InnodbSysTablespaces(String alias) {
		this(alias, INNODB_SYS_TABLESPACES);
	}

	private InnodbSysTablespaces(String alias, Table<InnodbSysTablespacesRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbSysTablespaces(String alias, Table<InnodbSysTablespacesRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablespaces as(String alias) {
		return new InnodbSysTablespaces(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbSysTablespaces rename(String name) {
		return new InnodbSysTablespaces(name, null);
	}
}
