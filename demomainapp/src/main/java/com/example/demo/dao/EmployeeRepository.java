package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeDetails;

public interface EmployeeRepository extends CrudRepository<EmployeeDetails, Integer> {
	

}
