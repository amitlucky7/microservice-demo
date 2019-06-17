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

import com.example.demo.model.Address;
import com.example.demo.service.AddressService;


@RestController
public class AddressResource {
	
	  @Autowired 
	  private AddressService addressService;

	  @RequestMapping(value="/emp",method = RequestMethod.POST)
	 public void saveEmp(@RequestBody Address emp) {
		 
		System.out.println("in save employee method of controller"); 
		addressService.save(emp);
	 }
	  
	  @RequestMapping(value="/address/{empId}", method = RequestMethod.GET)
	  public Optional<Address> getAddressById(@PathVariable("empId")int id) {
		  return addressService.getByEmployeeId(id);
	  }
	 
	  @ExceptionHandler(value = NullPointerException.class)
	  public String handleException(Exception exception) {
		  return "NullPointerException";
	  }
		

}
