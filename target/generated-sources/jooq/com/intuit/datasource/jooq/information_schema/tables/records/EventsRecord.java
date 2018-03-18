/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.records;


import com.intuit.datasource.jooq.information_schema.tables.Events;
import com.intuit.datasource.jooq.information_schema.tables.interfaces.IEvents;

import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class EventsRecord extends TableRecordImpl<EventsRecord> implements IEvents {

	private static final long serialVersionUID = 53569120;

	/**
	 * Setter for <code>information_schema.EVENTS.EVENT_CATALOG</code>.
	 */
	@Override
	public void setEventCatalog(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.EVENT_CATALOG</code>.
	 */
	@Override
	public String getEventCatalog() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
	 */
	@Override
	public void setEventSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
	 */
	@Override
	public String getEventSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.EVENT_NAME</code>.
	 */
	@Override
	public void setEventName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.EVENT_NAME</code>.
	 */
	@Override
	public String getEventName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.DEFINER</code>.
	 */
	@Override
	public void setDefiner(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.DEFINER</code>.
	 */
	@Override
	public String getDefiner() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.TIME_ZONE</code>.
	 */
	@Override
	public void setTimeZone(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.TIME_ZONE</code>.
	 */
	@Override
	public String getTimeZone() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.EVENT_BODY</code>.
	 */
	@Override
	public void setEventBody(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.EVENT_BODY</code>.
	 */
	@Override
	public String getEventBody() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
	 */
	@Override
	public void setEventDefinition(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
	 */
	@Override
	public String getEventDefinition() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.EVENT_TYPE</code>.
	 */
	@Override
	public void setEventType(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.EVENT_TYPE</code>.
	 */
	@Override
	public String getEventType() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.EXECUTE_AT</code>.
	 */
	@Override
	public void setExecuteAt(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.EXECUTE_AT</code>.
	 */
	@Override
	public Timestamp getExecuteAt() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
	 */
	@Override
	public void setIntervalValue(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
	 */
	@Override
	public String getIntervalValue() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
	 */
	@Override
	public void setIntervalField(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
	 */
	@Override
	public String getIntervalField() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.SQL_MODE</code>.
	 */
	@Override
	public void setSqlMode(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.SQL_MODE</code>.
	 */
	@Override
	public String getSqlMode() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.STARTS</code>.
	 */
	@Override
	public void setStarts(Timestamp value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.STARTS</code>.
	 */
	@Override
	public Timestamp getStarts() {
		return (Timestamp) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.ENDS</code>.
	 */
	@Override
	public void setEnds(Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.ENDS</code>.
	 */
	@Override
	public Timestamp getEnds() {
		return (Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.STATUS</code>.
	 */
	@Override
	public void setStatus(String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.STATUS</code>.
	 */
	@Override
	public String getStatus() {
		return (String) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.ON_COMPLETION</code>.
	 */
	@Override
	public void setOnCompletion(String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.ON_COMPLETION</code>.
	 */
	@Override
	public String getOnCompletion() {
		return (String) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.CREATED</code>.
	 */
	@Override
	public void setCreated(Timestamp value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.CREATED</code>.
	 */
	@Override
	public Timestamp getCreated() {
		return (Timestamp) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.LAST_ALTERED</code>.
	 */
	@Override
	public void setLastAltered(Timestamp value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.LAST_ALTERED</code>.
	 */
	@Override
	public Timestamp getLastAltered() {
		return (Timestamp) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.LAST_EXECUTED</code>.
	 */
	@Override
	public void setLastExecuted(Timestamp value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.LAST_EXECUTED</code>.
	 */
	@Override
	public Timestamp getLastExecuted() {
		return (Timestamp) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.EVENT_COMMENT</code>.
	 */
	@Override
	public void setEventComment(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.EVENT_COMMENT</code>.
	 */
	@Override
	public String getEventComment() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.ORIGINATOR</code>.
	 */
	@Override
	public void setOriginator(Long value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.ORIGINATOR</code>.
	 */
	@Override
	public Long getOriginator() {
		return (Long) getValue(20);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
	 */
	@Override
	public void setCharacterSetClient(String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
	 */
	@Override
	public String getCharacterSetClient() {
		return (String) getValue(21);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
	 */
	@Override
	public void setCollationConnection(String value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
	 */
	@Override
	public String getCollationConnection() {
		return (String) getValue(22);
	}

	/**
	 * Setter for <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
	 */
	@Override
	public void setDatabaseCollation(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
	 */
	@Override
	public String getDatabaseCollation() {
		return (String) getValue(23);
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IEvents from) {
		setEventCatalog(from.getEventCatalog());
		setEventSchema(from.getEventSchema());
		setEventName(from.getEventName());
		setDefiner(from.getDefiner());
		setTimeZone(from.getTimeZone());
		setEventBody(from.getEventBody());
		setEventDefinition(from.getEventDefinition());
		setEventType(from.getEventType());
		setExecuteAt(from.getExecuteAt());
		setIntervalValue(from.getIntervalValue());
		setIntervalField(from.getIntervalField());
		setSqlMode(from.getSqlMode());
		setStarts(from.getStarts());
		setEnds(from.getEnds());
		setStatus(from.getStatus());
		setOnCompletion(from.getOnCompletion());
		setCreated(from.getCreated());
		setLastAltered(from.getLastAltered());
		setLastExecuted(from.getLastExecuted());
		setEventComment(from.getEventComment());
		setOriginator(from.getOriginator());
		setCharacterSetClient(from.getCharacterSetClient());
		setCollationConnection(from.getCollationConnection());
		setDatabaseCollation(from.getDatabaseCollation());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IEvents> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsRecord
	 */
	public EventsRecord() {
		super(Events.EVENTS);
	}

	/**
	 * Create a detached, initialised EventsRecord
	 */
	public EventsRecord(String eventCatalog, String eventSchema, String eventName, String definer, String timeZone, String eventBody, String eventDefinition, String eventType, Timestamp executeAt, String intervalValue, String intervalField, String sqlMode, Timestamp starts, Timestamp ends, String status, String onCompletion, Timestamp created, Timestamp lastAltered, Timestamp lastExecuted, String eventComment, Long originator, String characterSetClient, String collationConnection, String databaseCollation) {
		super(Events.EVENTS);

		setValue(0, eventCatalog);
		setValue(1, eventSchema);
		setValue(2, eventName);
		setValue(3, definer);
		setValue(4, timeZone);
		setValue(5, eventBody);
		setValue(6, eventDefinition);
		setValue(7, eventType);
		setValue(8, executeAt);
		setValue(9, intervalValue);
		setValue(10, intervalField);
		setValue(11, sqlMode);
		setValue(12, starts);
		setValue(13, ends);
		setValue(14, status);
		setValue(15, onCompletion);
		setValue(16, created);
		setValue(17, lastAltered);
		setValue(18, lastExecuted);
		setValue(19, eventComment);
		setValue(20, originator);
		setValue(21, characterSetClient);
		setValue(22, collationConnection);
		setValue(23, databaseCollation);
	}
}