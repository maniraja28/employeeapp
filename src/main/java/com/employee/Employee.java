package com.employee;//package should be created com.extension only that means com.employee

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity//employee class is  directly mapping to the database table  its the use of entity//annotation
public class Employee { //Model or Entity this model is directly access to the databasetable

	@Id//unique or primary key
	private Integer id;//state or fields 
	private String name;//state
	private String address;//state
	private String mobileNum;//fields
	private String designation;//state or fields
	private Double salary;//state or fields
	// generate setters and getters methods
	public Integer getId() {//behaviour//methods
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
