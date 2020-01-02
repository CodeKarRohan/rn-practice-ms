package com.jda.jira.Examples.hteoas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@NotNull
	@Size(min=2, message="First name ame should have atleast 2 characters")
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull
	@Size(min=2, message="Last name ame should have atleast 2 characters")
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull
	@Size(min=2, message="Rol number should have atleast 2 characters")
	@Column(name = "rol_no")
	private String rolNumber;
	
	@Column(name = "address")
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRolNumber() {
		return rolNumber;
	}

	public void setRolNumber(String rolNumber) {
		this.rolNumber = rolNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
