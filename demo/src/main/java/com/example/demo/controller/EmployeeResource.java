package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeResource {
	
	  @Autowired 
	  private EmployeeService empService;

	  @RequestMapping(value="/emp",method = RequestMethod.POST)
	 public void saveEmp(@RequestBody Employee emp) {
		 
		System.out.println("in save employee method of controller"); 
		empService.save(emp);
	 }
	  
	  @RequestMapping(value="/emp/{empId}", method = RequestMethod.DELETE)
		  
		  public void deleteEmployee(@PathVariable("empId") int empId) {
			  empService.deleteEmployee(empId);
		  }
	  
	  @RequestMapping(value="/emp", method = RequestMethod.GET)
	  public List<Employee> getEmployees(){
		  
		 List<Employee> listEmp = empService.getAllEmployees();
		 return listEmp;
	  }
	  
	  @RequestMapping(value="/emp/{empId}", method = RequestMethod.GET)
	  public Optional<Employee> getEmployeeById(@PathVariable("empId")int id) {
		  return empService.getEmployeeById(id);
		  
		  
	  }
	 
	  @ExceptionHandler(value = NullPointerException.class)
	  public String handleException(Exception exception) {
		  return "NullPointerException";
	  }
		

}
