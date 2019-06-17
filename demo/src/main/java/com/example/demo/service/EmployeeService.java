package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public void save(Employee emp) {
		 employeeRepository.save(emp);
		
	}
	
	public List<Employee> getAllEmployees() {
		
		return (List<Employee>) employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(int id) {
		
		return employeeRepository.findById(id);
	}
	
	public void deleteEmployee(int id) {
		 employeeRepository.deleteById(id);
		
	}
	

	
}
