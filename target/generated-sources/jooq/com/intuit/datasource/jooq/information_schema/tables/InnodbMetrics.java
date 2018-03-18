/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables;


import com.intuit.datasource.jooq.information_schema.InformationSchema;
import com.intuit.datasource.jooq.information_schema.tables.records.InnodbMetricsRecord;

import java.sql.Timestamp;

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
public class InnodbMetrics extends TableImpl<InnodbMetricsRecord> {

	private static final long serialVersionUID = -423407970;

	/**
	 * The reference instance of <code>information_schema.INNODB_METRICS</code>
	 */
	public static final InnodbMetrics INNODB_METRICS = new InnodbMetrics();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbMetricsRecord> getRecordType() {
		return InnodbMetricsRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_METRICS.NAME</code>.
	 */
	public final TableField<InnodbMetricsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.SUBSYSTEM</code>.
	 */
	public final TableField<InnodbMetricsRecord, String> SUBSYSTEM = createField("SUBSYSTEM", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.COUNT</code>.
	 */
	public final TableField<InnodbMetricsRecord, Long> COUNT = createField("COUNT", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.MAX_COUNT</code>.
	 */
	public final TableField<InnodbMetricsRecord, Long> MAX_COUNT = createField("MAX_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.MIN_COUNT</code>.
	 */
	public final TableField<InnodbMetricsRecord, Long> MIN_COUNT = createField("MIN_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.AVG_COUNT</code>.
	 */
	public final TableField<InnodbMetricsRecord, Double> AVG_COUNT = createField("AVG_COUNT", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.COUNT_RESET</code>.
	 */
	public final TableField<InnodbMetricsRecord, Long> COUNT_RESET = createField("COUNT_RESET", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.MAX_COUNT_RESET</code>.
	 */
	public final TableField<InnodbMetricsRecord, Long> MAX_COUNT_RESET = createField("MAX_COUNT_RESET", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.MIN_COUNT_RESET</code>.
	 */
	public final TableField<InnodbMetricsRecord, Long> MIN_COUNT_RESET = createField("MIN_COUNT_RESET", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.AVG_COUNT_RESET</code>.
	 */
	public final TableField<InnodbMetricsRecord, Double> AVG_COUNT_RESET = createField("AVG_COUNT_RESET", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TIME_ENABLED</code>.
	 */
	public final TableField<InnodbMetricsRecord, Timestamp> TIME_ENABLED = createField("TIME_ENABLED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TIME_DISABLED</code>.
	 */
	public final TableField<InnodbMetricsRecord, Timestamp> TIME_DISABLED = createField("TIME_DISABLED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TIME_ELAPSED</code>.
	 */
	public final TableField<InnodbMetricsRecord, Long> TIME_ELAPSED = createField("TIME_ELAPSED", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TIME_RESET</code>.
	 */
	public final TableField<InnodbMetricsRecord, Timestamp> TIME_RESET = createField("TIME_RESET", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.STATUS</code>.
	 */
	public final TableField<InnodbMetricsRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TYPE</code>.
	 */
	public final TableField<InnodbMetricsRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.COMMENT</code>.
	 */
	public final TableField<InnodbMetricsRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_METRICS</code> table reference
	 */
	public InnodbMetrics() {
		this("INNODB_METRICS", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_METRICS</code> table reference
	 */
	public InnodbMetrics(String alias) {
		this(alias, INNODB_METRICS);
	}

	private InnodbMetrics(String alias, Table<InnodbMetricsRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbMetrics(String alias, Table<InnodbMetricsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetrics as(String alias) {
		return new InnodbMetrics(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbMetrics rename(String name) {
		return new InnodbMetrics(name, null);
	}
}
