package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.EmployeeDetails;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public void saveDetails(EmployeeDetails empDetails) {
		employeeRepository.save(empDetails);
	}
	

	
}
