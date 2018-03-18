/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.Triggers;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.ITriggers;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.TableRecordImpl;


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
public class TriggersRecord extends TableRecordImpl<TriggersRecord> implements Record22<String, String, String, String, String, String, String, Long, String, String, String, String, String, String, String, String, Timestamp, String, String, String, String, String>, ITriggers {

	private static final long serialVersionUID = 927631972;

	/**
	 * Setter for <code>information_schema.TRIGGERS.TRIGGER_CATALOG</code>.
	 */
	@Override
	public void setTriggerCatalog(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.TRIGGER_CATALOG</code>.
	 */
	@Override
	public String getTriggerCatalog() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.TRIGGER_SCHEMA</code>.
	 */
	@Override
	public void setTriggerSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.TRIGGER_SCHEMA</code>.
	 */
	@Override
	public String getTriggerSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.TRIGGER_NAME</code>.
	 */
	@Override
	public void setTriggerName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.TRIGGER_NAME</code>.
	 */
	@Override
	public String getTriggerName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.EVENT_MANIPULATION</code>.
	 */
	@Override
	public void setEventManipulation(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.EVENT_MANIPULATION</code>.
	 */
	@Override
	public String getEventManipulation() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.EVENT_OBJECT_CATALOG</code>.
	 */
	@Override
	public void setEventObjectCatalog(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_CATALOG</code>.
	 */
	@Override
	public String getEventObjectCatalog() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.EVENT_OBJECT_SCHEMA</code>.
	 */
	@Override
	public void setEventObjectSchema(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_SCHEMA</code>.
	 */
	@Override
	public String getEventObjectSchema() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.EVENT_OBJECT_TABLE</code>.
	 */
	@Override
	public void setEventObjectTable(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_TABLE</code>.
	 */
	@Override
	public String getEventObjectTable() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_ORDER</code>.
	 */
	@Override
	public void setActionOrder(Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_ORDER</code>.
	 */
	@Override
	public Long getActionOrder() {
		return (Long) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_CONDITION</code>.
	 */
	@Override
	public void setActionCondition(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_CONDITION</code>.
	 */
	@Override
	public String getActionCondition() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_STATEMENT</code>.
	 */
	@Override
	public void setActionStatement(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_STATEMENT</code>.
	 */
	@Override
	public String getActionStatement() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_ORIENTATION</code>.
	 */
	@Override
	public void setActionOrientation(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_ORIENTATION</code>.
	 */
	@Override
	public String getActionOrientation() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_TIMING</code>.
	 */
	@Override
	public void setActionTiming(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_TIMING</code>.
	 */
	@Override
	public String getActionTiming() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_TABLE</code>.
	 */
	@Override
	public void setActionReferenceOldTable(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_TABLE</code>.
	 */
	@Override
	public String getActionReferenceOldTable() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_TABLE</code>.
	 */
	@Override
	public void setActionReferenceNewTable(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_TABLE</code>.
	 */
	@Override
	public String getActionReferenceNewTable() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_ROW</code>.
	 */
	@Override
	public void setActionReferenceOldRow(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_ROW</code>.
	 */
	@Override
	public String getActionReferenceOldRow() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_ROW</code>.
	 */
	@Override
	public void setActionReferenceNewRow(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_ROW</code>.
	 */
	@Override
	public String getActionReferenceNewRow() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.CREATED</code>.
	 */
	@Override
	public void setCreated(Timestamp value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.CREATED</code>.
	 */
	@Override
	public Timestamp getCreated() {
		return (Timestamp) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.SQL_MODE</code>.
	 */
	@Override
	public void setSqlMode(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.SQL_MODE</code>.
	 */
	@Override
	public String getSqlMode() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.DEFINER</code>.
	 */
	@Override
	public void setDefiner(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.DEFINER</code>.
	 */
	@Override
	public String getDefiner() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.CHARACTER_SET_CLIENT</code>.
	 */
	@Override
	public void setCharacterSetClient(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.CHARACTER_SET_CLIENT</code>.
	 */
	@Override
	public String getCharacterSetClient() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.COLLATION_CONNECTION</code>.
	 */
	@Override
	public void setCollationConnection(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.COLLATION_CONNECTION</code>.
	 */
	@Override
	public String getCollationConnection() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.DATABASE_COLLATION</code>.
	 */
	@Override
	public void setDatabaseCollation(String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.DATABASE_COLLATION</code>.
	 */
	@Override
	public String getDatabaseCollation() {
		return (String) getValue(21);
	}

	// -------------------------------------------------------------------------
	// Record22 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row22<String, String, String, String, String, String, String, Long, String, String, String, String, String, String, String, String, Timestamp, String, String, String, String, String> fieldsRow() {
		return (Row22) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row22<String, String, String, String, String, String, String, Long, String, String, String, String, String, String, String, String, Timestamp, String, String, String, String, String> valuesRow() {
		return (Row22) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Triggers.TRIGGERS.TRIGGER_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Triggers.TRIGGERS.TRIGGER_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Triggers.TRIGGERS.TRIGGER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Triggers.TRIGGERS.EVENT_MANIPULATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Triggers.TRIGGERS.EVENT_OBJECT_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Triggers.TRIGGERS.EVENT_OBJECT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Triggers.TRIGGERS.EVENT_OBJECT_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field8() {
		return Triggers.TRIGGERS.ACTION_ORDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Triggers.TRIGGERS.ACTION_CONDITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return Triggers.TRIGGERS.ACTION_STATEMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return Triggers.TRIGGERS.ACTION_ORIENTATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return Triggers.TRIGGERS.ACTION_TIMING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return Triggers.TRIGGERS.ACTION_REFERENCE_OLD_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return Triggers.TRIGGERS.ACTION_REFERENCE_NEW_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field15() {
		return Triggers.TRIGGERS.ACTION_REFERENCE_OLD_ROW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field16() {
		return Triggers.TRIGGERS.ACTION_REFERENCE_NEW_ROW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field17() {
		return Triggers.TRIGGERS.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field18() {
		return Triggers.TRIGGERS.SQL_MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field19() {
		return Triggers.TRIGGERS.DEFINER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field20() {
		return Triggers.TRIGGERS.CHARACTER_SET_CLIENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field21() {
		return Triggers.TRIGGERS.COLLATION_CONNECTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field22() {
		return Triggers.TRIGGERS.DATABASE_COLLATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getTriggerCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTriggerSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTriggerName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getEventManipulation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getEventObjectCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getEventObjectSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getEventObjectTable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value8() {
		return getActionOrder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getActionCondition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getActionStatement();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getActionOrientation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getActionTiming();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getActionReferenceOldTable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getActionReferenceNewTable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value15() {
		return getActionReferenceOldRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value16() {
		return getActionReferenceNewRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value17() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value18() {
		return getSqlMode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value19() {
		return getDefiner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value20() {
		return getCharacterSetClient();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value21() {
		return getCollationConnection();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value22() {
		return getDatabaseCollation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value1(String value) {
		setTriggerCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value2(String value) {
		setTriggerSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value3(String value) {
		setTriggerName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value4(String value) {
		setEventManipulation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value5(String value) {
		setEventObjectCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value6(String value) {
		setEventObjectSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value7(String value) {
		setEventObjectTable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value8(Long value) {
		setActionOrder(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value9(String value) {
		setActionCondition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value10(String value) {
		setActionStatement(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value11(String value) {
		setActionOrientation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value12(String value) {
		setActionTiming(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value13(String value) {
		setActionReferenceOldTable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value14(String value) {
		setActionReferenceNewTable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value15(String value) {
		setActionReferenceOldRow(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value16(String value) {
		setActionReferenceNewRow(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value17(Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value18(String value) {
		setSqlMode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value19(String value) {
		setDefiner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value20(String value) {
		setCharacterSetClient(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value21(String value) {
		setCollationConnection(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value22(String value) {
		setDatabaseCollation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Long value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, Timestamp value17, String value18, String value19, String value20, String value21, String value22) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		value17(value17);
		value18(value18);
		value19(value19);
		value20(value20);
		value21(value21);
		value22(value22);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITriggers from) {
		setTriggerCatalog(from.getTriggerCatalog());
		setTriggerSchema(from.getTriggerSchema());
		setTriggerName(from.getTriggerName());
		setEventManipulation(from.getEventManipulation());
		setEventObjectCatalog(from.getEventObjectCatalog());
		setEventObjectSchema(from.getEventObjectSchema());
		setEventObjectTable(from.getEventObjectTable());
		setActionOrder(from.getActionOrder());
		setActionCondition(from.getActionCondition());
		setActionStatement(from.getActionStatement());
		setActionOrientation(from.getActionOrientation());
		setActionTiming(from.getActionTiming());
		setActionReferenceOldTable(from.getActionReferenceOldTable());
		setActionReferenceNewTable(from.getActionReferenceNewTable());
		setActionReferenceOldRow(from.getActionReferenceOldRow());
		setActionReferenceNewRow(from.getActionReferenceNewRow());
		setCreated(from.getCreated());
		setSqlMode(from.getSqlMode());
		setDefiner(from.getDefiner());
		setCharacterSetClient(from.getCharacterSetClient());
		setCollationConnection(from.getCollationConnection());
		setDatabaseCollation(from.getDatabaseCollation());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITriggers> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TriggersRecord
	 */
	public TriggersRecord() {
		super(Triggers.TRIGGERS);
	}

	/**
	 * Create a detached, initialised TriggersRecord
	 */
	public TriggersRecord(String triggerCatalog, String triggerSchema, String triggerName, String eventManipulation, String eventObjectCatalog, String eventObjectSchema, String eventObjectTable, Long actionOrder, String actionCondition, String actionStatement, String actionOrientation, String actionTiming, String actionReferenceOldTable, String actionReferenceNewTable, String actionReferenceOldRow, String actionReferenceNewRow, Timestamp created, String sqlMode, String definer, String characterSetClient, String collationConnection, String databaseCollation) {
		super(Triggers.TRIGGERS);

		setValue(0, triggerCatalog);
		setValue(1, triggerSchema);
		setValue(2, triggerName);
		setValue(3, eventManipulation);
		setValue(4, eventObjectCatalog);
		setValue(5, eventObjectSchema);
		setValue(6, eventObjectTable);
		setValue(7, actionOrder);
		setValue(8, actionCondition);
		setValue(9, actionStatement);
		setValue(10, actionOrientation);
		setValue(11, actionTiming);
		setValue(12, actionReferenceOldTable);
		setValue(13, actionReferenceNewTable);
		setValue(14, actionReferenceOldRow);
		setValue(15, actionReferenceNewRow);
		setValue(16, created);
		setValue(17, sqlMode);
		setValue(18, definer);
		setValue(19, characterSetClient);
		setValue(20, collationConnection);
		setValue(21, databaseCollation);
	}
}
