package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeDetails;
import com.example.demo.service.EmployeeService;


@RestController
public class AddressResource {

	@Autowired	
	EmployeeService empService;
	@Autowired
	  RestTemplate restTemplate;

	  @RequestMapping(value="/info/{empId}", method = RequestMethod.GET)
	  public EmployeeDetails getEmpDetails(@PathVariable("empId")int id) {
		  
		 Employee employee =  restTemplate.getForObject("http://employee-service/emp/"+id,Employee.class);
		 Address address = restTemplate.getForObject("http://address-service/address/"+id,Address.class);
		System.out.println(employee);
		System.out.println(address);
		 EmployeeDetails empDetails = new EmployeeDetails(employee.getId(), employee.getName(), employee.getEmail(), address.getCity(),address.getState());
		// return (ResponseBody) empDetails;
		 empService.saveDetails(empDetails);
		 return empDetails;
	  }
	 
	  

}
