package com.springboot.Jenkins_Practice_Project.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.Jenkins_Practice_Project.model.Customer;

public interface ClinicRepository extends CrudRepository<Customer, Integer>{

}
