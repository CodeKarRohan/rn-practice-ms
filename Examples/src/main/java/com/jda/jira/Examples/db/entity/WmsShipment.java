package com.jda.jira.Examples.db.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WMS_SHIPMENT")
public class WmsShipment {
	
	@Id
	@Column(name="shipment_id")
	private Integer shipmentId;
	
	@Column(name="shipment_name")
	private String shipmentName;
	
	@Column(name="shipment_status")
	private char shipmentStatus;
	
	@Column(name="equipment_id")
	private String equipmentId;
	
	@Column(name="Create_date")
	private Date createDate;

	public Integer getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getShipmentName() {
		return shipmentName;
	}

	public void setShipmentName(String shipmentName) {
		this.shipmentName = shipmentName;
	}

	public char getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(char shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public String getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	

}
