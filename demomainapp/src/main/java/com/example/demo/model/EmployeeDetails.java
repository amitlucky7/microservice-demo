package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {

	
	@Id
	private Integer id;
	private String name;
	private String email;
	private String city;
	private String state;
	
	public EmployeeDetails() {
	}
	
	public EmployeeDetails(Integer empId, String name,String email, String city, String state) {
		super();
		this.id = empId;
		this.name = name;
		this.city = city;
		this.email = email;
		this.state = state;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
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
	@Override
	public String toString() {
		return "empId=" + id + ", name=" + name + ", city=" + city + ", state=" + state;
	}
	
	
}
