package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AddressRepository;
import com.example.demo.model.Address;


@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository ;

	public void save(Address emp) {
		addressRepository.save(emp);
		
	}
	
	public List<Address> getAllEmployees() {
		
		return (List<Address>) addressRepository.findAll();
	}
	
	public Optional<Address> getByEmployeeId(int id) {
		
		return addressRepository.findById(id);
	}
	
	public void deleteEmployee(int id) {
		addressRepository.deleteById(id);
		
	}
	

	
}
