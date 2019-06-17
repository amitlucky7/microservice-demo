package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {
	

}
