package com.jda.jira.Examples.hackthon.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;



@Entity
@Table(name = "WMS_OPERATOR_HEALTH")
public class OperatorHealthTab implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OPR_HLT_SEQ")
	@Column(name = "ID")
	private Long Id;
	
	@Column(name = "USER_NAME")
	private String  userName;
	
	@Column(name = "RECORD_DATE")
	private Date recordDate;
	
	@Column(name = "PULSE_RATE")
	private Integer pulseRate;
	
	@Column(name = "BP_HIGH")
	private Integer BpHigh;
	
	@Column(name = "BP_LOW")
    private Integer BpLow;
	
	@Column(name = "OXYGEN_SATURATION")
    private Integer OxygenSaturation;
	
	@Column(name = "BODY_TEMP")
    private Integer BodyTemprature;
	
	@Column(name = "HEALTH_CONDITION")
    private Integer healthCondition;

	@Column(name = "stress_factor")
	private Integer stressFactor;
	
	public Integer getStressFactor() {
		return stressFactor;
	}

	public void setStressFactor(Integer stressFactor) {
		this.stressFactor = stressFactor;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public Integer getPulseRate() {
		return pulseRate;
	}

	public void setPulseRate(Integer pulseRate) {
		this.pulseRate = pulseRate;
	}

	public Integer getBpHigh() {
		return BpHigh;
	}

	public void setBpHigh(Integer bpHigh) {
		BpHigh = bpHigh;
	}

	public Integer getBpLow() {
		return BpLow;
	}

	public void setBpLow(Integer bpLow) {
		BpLow = bpLow;
	}

	public Integer getOxygenSaturation() {
		return OxygenSaturation;
	}

	public void setOxygenSaturation(Integer oxygenSaturation) {
		OxygenSaturation = oxygenSaturation;
	}

	public Integer getBodyTemprature() {
		return BodyTemprature;
	}

	public void setBodyTemprature(Integer bodyTemprature) {
		BodyTemprature = bodyTemprature;
	}

	public Integer getHealthCondition() {
		return healthCondition;
	}

	public void setHealthCondition(Integer healthCondition) {
		this.healthCondition = healthCondition;
	}
	
	
    

}
