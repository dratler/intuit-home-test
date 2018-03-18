/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

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
public interface IRoutines extends Serializable {

	/**
	 * Setter for <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
	 */
	public void setSpecificName(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
	 */
	public String getSpecificName();

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
	 */
	public void setRoutineCatalog(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
	 */
	public String getRoutineCatalog();

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
	 */
	public void setRoutineSchema(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
	 */
	public String getRoutineSchema();

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
	 */
	public void setRoutineName(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
	 */
	public String getRoutineName();

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
	 */
	public void setRoutineType(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
	 */
	public String getRoutineType();

	/**
	 * Setter for <code>information_schema.ROUTINES.DATA_TYPE</code>.
	 */
	public void setDataType(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.DATA_TYPE</code>.
	 */
	public String getDataType();

	/**
	 * Setter for <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public void setCharacterMaximumLength(Integer value);

	/**
	 * Getter for <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public Integer getCharacterMaximumLength();

	/**
	 * Setter for <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
	 */
	public void setCharacterOctetLength(Integer value);

	/**
	 * Getter for <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
	 */
	public Integer getCharacterOctetLength();

	/**
	 * Setter for <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
	 */
	public void setNumericPrecision(ULong value);

	/**
	 * Getter for <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
	 */
	public ULong getNumericPrecision();

	/**
	 * Setter for <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
	 */
	public void setNumericScale(Integer value);

	/**
	 * Getter for <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
	 */
	public Integer getNumericScale();

	/**
	 * Setter for <code>information_schema.ROUTINES.DATETIME_PRECISION</code>.
	 */
	public void setDatetimePrecision(ULong value);

	/**
	 * Getter for <code>information_schema.ROUTINES.DATETIME_PRECISION</code>.
	 */
	public ULong getDatetimePrecision();

	/**
	 * Setter for <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
	 */
	public void setCharacterSetName(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
	 */
	public String getCharacterSetName();

	/**
	 * Setter for <code>information_schema.ROUTINES.COLLATION_NAME</code>.
	 */
	public void setCollationName(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.COLLATION_NAME</code>.
	 */
	public String getCollationName();

	/**
	 * Setter for <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
	 */
	public void setDtdIdentifier(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
	 */
	public String getDtdIdentifier();

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
	 */
	public void setRoutineBody(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
	 */
	public String getRoutineBody();

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
	 */
	public void setRoutineDefinition(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
	 */
	public String getRoutineDefinition();

	/**
	 * Setter for <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
	 */
	public void setExternalName(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
	 */
	public String getExternalName();

	/**
	 * Setter for <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
	 */
	public void setExternalLanguage(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
	 */
	public String getExternalLanguage();

	/**
	 * Setter for <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
	 */
	public void setParameterStyle(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
	 */
	public String getParameterStyle();

	/**
	 * Setter for <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
	 */
	public void setIsDeterministic(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
	 */
	public String getIsDeterministic();

	/**
	 * Setter for <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
	 */
	public void setSqlDataAccess(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
	 */
	public String getSqlDataAccess();

	/**
	 * Setter for <code>information_schema.ROUTINES.SQL_PATH</code>.
	 */
	public void setSqlPath(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.SQL_PATH</code>.
	 */
	public String getSqlPath();

	/**
	 * Setter for <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
	 */
	public void setSecurityType(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
	 */
	public String getSecurityType();

	/**
	 * Setter for <code>information_schema.ROUTINES.CREATED</code>.
	 */
	public void setCreated(Timestamp value);

	/**
	 * Getter for <code>information_schema.ROUTINES.CREATED</code>.
	 */
	public Timestamp getCreated();

	/**
	 * Setter for <code>information_schema.ROUTINES.LAST_ALTERED</code>.
	 */
	public void setLastAltered(Timestamp value);

	/**
	 * Getter for <code>information_schema.ROUTINES.LAST_ALTERED</code>.
	 */
	public Timestamp getLastAltered();

	/**
	 * Setter for <code>information_schema.ROUTINES.SQL_MODE</code>.
	 */
	public void setSqlMode(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.SQL_MODE</code>.
	 */
	public String getSqlMode();

	/**
	 * Setter for <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
	 */
	public void setRoutineComment(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
	 */
	public String getRoutineComment();

	/**
	 * Setter for <code>information_schema.ROUTINES.DEFINER</code>.
	 */
	public void setDefiner(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.DEFINER</code>.
	 */
	public String getDefiner();

	/**
	 * Setter for <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
	 */
	public void setCharacterSetClient(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
	 */
	public String getCharacterSetClient();

	/**
	 * Setter for <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
	 */
	public void setCollationConnection(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
	 */
	public String getCollationConnection();

	/**
	 * Setter for <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
	 */
	public void setDatabaseCollation(String value);

	/**
	 * Getter for <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
	 */
	public String getDatabaseCollation();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IRoutines
	 */
	public void from(com.intuit.datasource.jooq.information_schema.tables.interfaces.IRoutines from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IRoutines
	 */
	public <E extends com.intuit.datasource.jooq.information_schema.tables.interfaces.IRoutines> E into(E into);
}
