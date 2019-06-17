package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Address {

	@Id
	private int empid;
	private String city;
	private String state;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
