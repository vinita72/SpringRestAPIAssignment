package com.SpringTestMongoDb.SpringTestMongoDbServic;


import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.springboot.mongo.dao.Productdao;
import com.assignment.springboot.mongo.model.Product;

mport java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.assignment.springboot.mongo.model.Product;

public interface Productservice {

	
	public void createEmployee(List<Productservice> emp);

	
	public Collection<Productservice> getAllEmployees();

	
	public Optional<Productservice> findEmployeeById(int id);

	
	public void deleteEmployeeById(int id);

	
	public void updateEmployee(Productservice emp);

	
	public void deleteAllEmployees();
}