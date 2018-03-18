/**
 * This class is generated by jOOQ
 */
package com.intuit.datasource.jooq.information_schema.tables.pojos;


import com.intuit.datasource.jooq.information_schema.tables.interfaces.IProfiling;

import java.math.BigDecimal;

import javax.annotation.Generated;


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
public class Profiling implements IProfiling {

	private static final long serialVersionUID = 1669805329;

	private Integer    queryId;
	private Integer    seq;
	private String     state;
	private BigDecimal duration;
	private BigDecimal cpuUser;
	private BigDecimal cpuSystem;
	private Integer    contextVoluntary;
	private Integer    contextInvoluntary;
	private Integer    blockOpsIn;
	private Integer    blockOpsOut;
	private Integer    messagesSent;
	private Integer    messagesReceived;
	private Integer    pageFaultsMajor;
	private Integer    pageFaultsMinor;
	private Integer    swaps;
	private String     sourceFunction;
	private String     sourceFile;
	private Integer    sourceLine;

	public Profiling() {}

	public Profiling(Profiling value) {
		this.queryId = value.queryId;
		this.seq = value.seq;
		this.state = value.state;
		this.duration = value.duration;
		this.cpuUser = value.cpuUser;
		this.cpuSystem = value.cpuSystem;
		this.contextVoluntary = value.contextVoluntary;
		this.contextInvoluntary = value.contextInvoluntary;
		this.blockOpsIn = value.blockOpsIn;
		this.blockOpsOut = value.blockOpsOut;
		this.messagesSent = value.messagesSent;
		this.messagesReceived = value.messagesReceived;
		this.pageFaultsMajor = value.pageFaultsMajor;
		this.pageFaultsMinor = value.pageFaultsMinor;
		this.swaps = value.swaps;
		this.sourceFunction = value.sourceFunction;
		this.sourceFile = value.sourceFile;
		this.sourceLine = value.sourceLine;
	}

	public Profiling(
		Integer    queryId,
		Integer    seq,
		String     state,
		BigDecimal duration,
		BigDecimal cpuUser,
		BigDecimal cpuSystem,
		Integer    contextVoluntary,
		Integer    contextInvoluntary,
		Integer    blockOpsIn,
		Integer    blockOpsOut,
		Integer    messagesSent,
		Integer    messagesReceived,
		Integer    pageFaultsMajor,
		Integer    pageFaultsMinor,
		Integer    swaps,
		String     sourceFunction,
		String     sourceFile,
		Integer    sourceLine
	) {
		this.queryId = queryId;
		this.seq = seq;
		this.state = state;
		this.duration = duration;
		this.cpuUser = cpuUser;
		this.cpuSystem = cpuSystem;
		this.contextVoluntary = contextVoluntary;
		this.contextInvoluntary = contextInvoluntary;
		this.blockOpsIn = blockOpsIn;
		this.blockOpsOut = blockOpsOut;
		this.messagesSent = messagesSent;
		this.messagesReceived = messagesReceived;
		this.pageFaultsMajor = pageFaultsMajor;
		this.pageFaultsMinor = pageFaultsMinor;
		this.swaps = swaps;
		this.sourceFunction = sourceFunction;
		this.sourceFile = sourceFile;
		this.sourceLine = sourceLine;
	}

	@Override
	public Integer getQueryId() {
		return this.queryId;
	}

	@Override
	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	@Override
	public Integer getSeq() {
		return this.seq;
	}

	@Override
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Override
	public String getState() {
		return this.state;
	}

	@Override
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public BigDecimal getDuration() {
		return this.duration;
	}

	@Override
	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	@Override
	public BigDecimal getCpuUser() {
		return this.cpuUser;
	}

	@Override
	public void setCpuUser(BigDecimal cpuUser) {
		this.cpuUser = cpuUser;
	}

	@Override
	public BigDecimal getCpuSystem() {
		return this.cpuSystem;
	}

	@Override
	public void setCpuSystem(BigDecimal cpuSystem) {
		this.cpuSystem = cpuSystem;
	}

	@Override
	public Integer getContextVoluntary() {
		return this.contextVoluntary;
	}

	@Override
	public void setContextVoluntary(Integer contextVoluntary) {
		this.contextVoluntary = contextVoluntary;
	}

	@Override
	public Integer getContextInvoluntary() {
		return this.contextInvoluntary;
	}

	@Override
	public void setContextInvoluntary(Integer contextInvoluntary) {
		this.contextInvoluntary = contextInvoluntary;
	}

	@Override
	public Integer getBlockOpsIn() {
		return this.blockOpsIn;
	}

	@Override
	public void setBlockOpsIn(Integer blockOpsIn) {
		this.blockOpsIn = blockOpsIn;
	}

	@Override
	public Integer getBlockOpsOut() {
		return this.blockOpsOut;
	}

	@Override
	public void setBlockOpsOut(Integer blockOpsOut) {
		this.blockOpsOut = blockOpsOut;
	}

	@Override
	public Integer getMessagesSent() {
		return this.messagesSent;
	}

	@Override
	public void setMessagesSent(Integer messagesSent) {
		this.messagesSent = messagesSent;
	}

	@Override
	public Integer getMessagesReceived() {
		return this.messagesReceived;
	}

	@Override
	public void setMessagesReceived(Integer messagesReceived) {
		this.messagesReceived = messagesReceived;
	}

	@Override
	public Integer getPageFaultsMajor() {
		return this.pageFaultsMajor;
	}

	@Override
	public void setPageFaultsMajor(Integer pageFaultsMajor) {
		this.pageFaultsMajor = pageFaultsMajor;
	}

	@Override
	public Integer getPageFaultsMinor() {
		return this.pageFaultsMinor;
	}

	@Override
	public void setPageFaultsMinor(Integer pageFaultsMinor) {
		this.pageFaultsMinor = pageFaultsMinor;
	}

	@Override
	public Integer getSwaps() {
		return this.swaps;
	}

	@Override
	public void setSwaps(Integer swaps) {
		this.swaps = swaps;
	}

	@Override
	public String getSourceFunction() {
		return this.sourceFunction;
	}

	@Override
	public void setSourceFunction(String sourceFunction) {
		this.sourceFunction = sourceFunction;
	}

	@Override
	public String getSourceFile() {
		return this.sourceFile;
	}

	@Override
	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}

	@Override
	public Integer getSourceLine() {
		return this.sourceLine;
	}

	@Override
	public void setSourceLine(Integer sourceLine) {
		this.sourceLine = sourceLine;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Profiling (");

		sb.append(queryId);
		sb.append(", ").append(seq);
		sb.append(", ").append(state);
		sb.append(", ").append(duration);
		sb.append(", ").append(cpuUser);
		sb.append(", ").append(cpuSystem);
		sb.append(", ").append(contextVoluntary);
		sb.append(", ").append(contextInvoluntary);
		sb.append(", ").append(blockOpsIn);
		sb.append(", ").append(blockOpsOut);
		sb.append(", ").append(messagesSent);
		sb.append(", ").append(messagesReceived);
		sb.append(", ").append(pageFaultsMajor);
		sb.append(", ").append(pageFaultsMinor);
		sb.append(", ").append(swaps);
		sb.append(", ").append(sourceFunction);
		sb.append(", ").append(sourceFile);
		sb.append(", ").append(sourceLine);

		sb.append(")");
		return sb.toString();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IProfiling from) {
		setQueryId(from.getQueryId());
		setSeq(from.getSeq());
		setState(from.getState());
		setDuration(from.getDuration());
		setCpuUser(from.getCpuUser());
		setCpuSystem(from.getCpuSystem());
		setContextVoluntary(from.getContextVoluntary());
		setContextInvoluntary(from.getContextInvoluntary());
		setBlockOpsIn(from.getBlockOpsIn());
		setBlockOpsOut(from.getBlockOpsOut());
		setMessagesSent(from.getMessagesSent());
		setMessagesReceived(from.getMessagesReceived());
		setPageFaultsMajor(from.getPageFaultsMajor());
		setPageFaultsMinor(from.getPageFaultsMinor());
		setSwaps(from.getSwaps());
		setSourceFunction(from.getSourceFunction());
		setSourceFile(from.getSourceFile());
		setSourceLine(from.getSourceLine());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IProfiling> E into(E into) {
		into.from(this);
		return into;
	}
}
