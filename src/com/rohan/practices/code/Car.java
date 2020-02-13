package com.rohan.practices.code;

import com.rohan.practices.annotation.JsonField;

public class Car {

	@JsonField(value= "name")
	private String carName;
	
	@JsonField(value = "manufaturer")
	private String carManufature;
	
	@JsonField
	private String carType;
	
	private int id;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarManufature() {
		return carManufature;
	}

	public void setCarManufature(String carManufature) {
		this.carManufature = carManufature;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
