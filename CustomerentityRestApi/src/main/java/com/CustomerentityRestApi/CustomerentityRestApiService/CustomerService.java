package com.CustomerentityRestApi.CustomerentityRestApiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.loader.custom.CustomQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.CustomerEntity;
import com.howtodoinjava.demo.repository.CustomerRepository;
 
@Service
public class CustomerService {
     
    @Autowired
    CustomerRepository repository;
     
    public List<CustomerEntity> getAllCustomer()
    {
        List<CustomerEntity> customerList = repository.findAll();
         
        if(customerList.size() > 0) {
            return customerList;
        } else {
            return new ArrayList<CustomerEntity>();
        }
    }
     
    public CustomerEntity getCustomerById(Long id) throws RecordNotFoundException
    {
        Optional<CustomerEntity> customer = repository.findById(id);
         
        if(customer.isPresent()) {
            return customer.get();
        } else {
            throw new RecordNotFoundException("No customer record exist for given id");
        }
    }
     
    public CustomerEntity createOrUpdateCustomer(CustomerEntity entity) throws RecordNotFoundException
    {
        Optional<CustomerEntity> customer = repository.findById(entity.getId());
         
        if(customer.isPresent())
        {
            CustomerEntity newEntity = customer.get();
            newEntity.setFirstName(entity.getFirstName());
            newEntity.setLastName(entity.getLastName());
            newEntity.setStreet(entity.getStreet());
            newEntity.setCity(entity.getCity());
            newEntity.setState(entity.getState());
            newEntity.setZip(entity.getZip());
            newEntity.setCountry(entity.getCountry());
 
            newEntity = repository.save(newEntity);
             
            return newEntity;
        } else {
            entity = repository.save(entity);
             
            return entity;
        }
    }
     
    public void deleteCustomerById(Long id) throws RecordNotFoundException
    {
        Optional<CustomQuery> customer = repository.findById(id);
         
        if(customer.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No customer record exist for given id");
        }
    }
}