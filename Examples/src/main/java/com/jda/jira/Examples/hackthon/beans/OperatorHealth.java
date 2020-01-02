package com.jda.jira.Examples.hackthon.beans;

import java.util.Date;

public class OperatorHealth {

	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private String operatorName;
	private Integer pulseRate;
	private Date recordedDate;
	private Integer HighBp;
	private Integer lowBp;
	private Integer oxygenSat;
	private Integer bodyTemprature;
	private String health;
	private Integer stressFactor;
	
	public Integer getStressFactor() {
		return stressFactor;
	}
	public void setStressFactor(Integer stressFactor) {
		this.stressFactor = stressFactor;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public Integer getPulseRate() {
		return pulseRate;
	}
	public void setPulseRate(Integer pulseRate) {
		this.pulseRate = pulseRate;
	}
	public Date getRecordedDate() {
		return recordedDate;
	}
	public void setRecordedDate(Date recordedDate) {
		this.recordedDate = recordedDate;
	}
	public Integer getHighBp() {
		return HighBp;
	}
	public void setHighBp(Integer highBp) {
		HighBp = highBp;
	}
	public Integer getLowBp() {
		return lowBp;
	}
	public void setLowBp(Integer lowBp) {
		this.lowBp = lowBp;
	}
	public Integer getOxygenSat() {
		return oxygenSat;
	}
	public void setOxygenSat(Integer oxygenSat) {
		this.oxygenSat = oxygenSat;
	}
	public Integer getBodyTemprature() {
		return bodyTemprature;
	}
	public void setBodyTemprature(Integer bodyTemprature) {
		this.bodyTemprature = bodyTemprature;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	
	
	
	
}
