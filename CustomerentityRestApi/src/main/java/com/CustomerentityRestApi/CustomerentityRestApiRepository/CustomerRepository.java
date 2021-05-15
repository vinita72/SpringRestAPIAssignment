package com.CustomerentityRestApi.CustomerentityRestApiRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.CustomerEntity;
 
@Repository
public interface CustomerRepository
        extends JpaRepository<CustomerEntity, Long> {
 
}