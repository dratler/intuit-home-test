/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema;


import com.intuit.datasource.jooq.information_schema.tables.CharacterSets;
import com.intuit.datasource.jooq.information_schema.tables.CollationCharacterSetApplicability;
import com.intuit.datasource.jooq.information_schema.tables.Collations;
import com.intuit.datasource.jooq.information_schema.tables.ColumnPrivileges;
import com.intuit.datasource.jooq.information_schema.tables.Columns;
import com.intuit.datasource.jooq.information_schema.tables.Engines;
import com.intuit.datasource.jooq.information_schema.tables.Events;
import com.intuit.datasource.jooq.information_schema.tables.Files;
import com.intuit.datasource.jooq.information_schema.tables.GlobalStatus;
import com.intuit.datasource.jooq.information_schema.tables.GlobalVariables;
import com.intuit.datasource.jooq.information_schema.tables.InnodbBufferPage;
import com.intuit.datasource.jooq.information_schema.tables.InnodbBufferPageLru;
import com.intuit.datasource.jooq.information_schema.tables.InnodbBufferPoolStats;
import com.intuit.datasource.jooq.information_schema.tables.InnodbCmp;
import com.intuit.datasource.jooq.information_schema.tables.InnodbCmpPerIndex;
import com.intuit.datasource.jooq.information_schema.tables.InnodbCmpPerIndexReset;
import com.intuit.datasource.jooq.information_schema.tables.InnodbCmpReset;
import com.intuit.datasource.jooq.information_schema.tables.InnodbCmpmem;
import com.intuit.datasource.jooq.information_schema.tables.InnodbCmpmemReset;
import com.intuit.datasource.jooq.information_schema.tables.InnodbFtBeingDeleted;
import com.intuit.datasource.jooq.information_schema.tables.InnodbFtConfig;
import com.intuit.datasource.jooq.information_schema.tables.InnodbFtDefaultStopword;
import com.intuit.datasource.jooq.information_schema.tables.InnodbFtDeleted;
import com.intuit.datasource.jooq.information_schema.tables.InnodbFtIndexCache;
import com.intuit.datasource.jooq.information_schema.tables.InnodbFtIndexTable;
import com.intuit.datasource.jooq.information_schema.tables.InnodbLockWaits;
import com.intuit.datasource.jooq.information_schema.tables.InnodbLocks;
import com.intuit.datasource.jooq.information_schema.tables.InnodbMetrics;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysColumns;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysDatafiles;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysFields;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysForeign;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysForeignCols;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysIndexes;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysTables;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysTablespaces;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysTablestats;
import com.intuit.datasource.jooq.information_schema.tables.InnodbSysVirtual;
import com.intuit.datasource.jooq.information_schema.tables.InnodbTempTableInfo;
import com.intuit.datasource.jooq.information_schema.tables.InnodbTrx;
import com.intuit.datasource.jooq.information_schema.tables.KeyColumnUsage;
import com.intuit.datasource.jooq.information_schema.tables.OptimizerTrace;
import com.intuit.datasource.jooq.information_schema.tables.Parameters;
import com.intuit.datasource.jooq.information_schema.tables.Partitions;
import com.intuit.datasource.jooq.information_schema.tables.Plugins;
import com.intuit.datasource.jooq.information_schema.tables.Processlist;
import com.intuit.datasource.jooq.information_schema.tables.Profiling;
import com.intuit.datasource.jooq.information_schema.tables.ReferentialConstraints;
import com.intuit.datasource.jooq.information_schema.tables.Routines;
import com.intuit.datasource.jooq.information_schema.tables.SchemaPrivileges;
import com.intuit.datasource.jooq.information_schema.tables.Schemata;
import com.intuit.datasource.jooq.information_schema.tables.SessionStatus;
import com.intuit.datasource.jooq.information_schema.tables.SessionVariables;
import com.intuit.datasource.jooq.information_schema.tables.Statistics;
import com.intuit.datasource.jooq.information_schema.tables.TableConstraints;
import com.intuit.datasource.jooq.information_schema.tables.TablePrivileges;
import com.intuit.datasource.jooq.information_schema.tables.Tables;
import com.intuit.datasource.jooq.information_schema.tables.Tablespaces;
import com.intuit.datasource.jooq.information_schema.tables.Triggers;
import com.intuit.datasource.jooq.information_schema.tables.UserPrivileges;
import com.intuit.datasource.jooq.information_schema.tables.Views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class InformationSchema extends SchemaImpl {

	private static final long serialVersionUID = 1317986545;

	/**
	 * The reference instance of <code>information_schema</code>
	 */
	public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

	/**
	 * No further instances allowed
	 */
	private InformationSchema() {
		super("information_schema");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			CharacterSets.CHARACTER_SETS,
			Collations.COLLATIONS,
			CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY,
			Columns.COLUMNS,
			ColumnPrivileges.COLUMN_PRIVILEGES,
			Engines.ENGINES,
			Events.EVENTS,
			Files.FILES,
			GlobalStatus.GLOBAL_STATUS,
			GlobalVariables.GLOBAL_VARIABLES,
			InnodbBufferPage.INNODB_BUFFER_PAGE,
			InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU,
			InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS,
			InnodbCmp.INNODB_CMP,
			InnodbCmpmem.INNODB_CMPMEM,
			InnodbCmpmemReset.INNODB_CMPMEM_RESET,
			InnodbCmpPerIndex.INNODB_CMP_PER_INDEX,
			InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET,
			InnodbCmpReset.INNODB_CMP_RESET,
			InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED,
			InnodbFtConfig.INNODB_FT_CONFIG,
			InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD,
			InnodbFtDeleted.INNODB_FT_DELETED,
			InnodbFtIndexCache.INNODB_FT_INDEX_CACHE,
			InnodbFtIndexTable.INNODB_FT_INDEX_TABLE,
			InnodbLocks.INNODB_LOCKS,
			InnodbLockWaits.INNODB_LOCK_WAITS,
			InnodbMetrics.INNODB_METRICS,
			InnodbSysColumns.INNODB_SYS_COLUMNS,
			InnodbSysDatafiles.INNODB_SYS_DATAFILES,
			InnodbSysFields.INNODB_SYS_FIELDS,
			InnodbSysForeign.INNODB_SYS_FOREIGN,
			InnodbSysForeignCols.INNODB_SYS_FOREIGN_COLS,
			InnodbSysIndexes.INNODB_SYS_INDEXES,
			InnodbSysTables.INNODB_SYS_TABLES,
			InnodbSysTablespaces.INNODB_SYS_TABLESPACES,
			InnodbSysTablestats.INNODB_SYS_TABLESTATS,
			InnodbSysVirtual.INNODB_SYS_VIRTUAL,
			InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO,
			InnodbTrx.INNODB_TRX,
			KeyColumnUsage.KEY_COLUMN_USAGE,
			OptimizerTrace.OPTIMIZER_TRACE,
			Parameters.PARAMETERS,
			Partitions.PARTITIONS,
			Plugins.PLUGINS,
			Processlist.PROCESSLIST,
			Profiling.PROFILING,
			ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
			Routines.ROUTINES,
			Schemata.SCHEMATA,
			SchemaPrivileges.SCHEMA_PRIVILEGES,
			SessionStatus.SESSION_STATUS,
			SessionVariables.SESSION_VARIABLES,
			Statistics.STATISTICS,
			Tables.TABLES,
			Tablespaces.TABLESPACES,
			TableConstraints.TABLE_CONSTRAINTS,
			TablePrivileges.TABLE_PRIVILEGES,
			Triggers.TRIGGERS,
			UserPrivileges.USER_PRIVILEGES,
			Views.VIEWS);
	}
}
