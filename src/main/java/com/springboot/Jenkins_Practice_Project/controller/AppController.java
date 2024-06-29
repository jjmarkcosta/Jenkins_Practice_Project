package com.springboot.Jenkins_Practice_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Jenkins_Practice_Project.model.Customer;
import com.springboot.Jenkins_Practice_Project.model.Response;
import com.springboot.Jenkins_Practice_Project.repository.ClinicRepository;



@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	ClinicRepository repository;

	@PostMapping("/log")
	public ResponseEntity<Response> logAppointment(@RequestParam String name, @RequestParam String petName,
			@RequestParam String phone, @RequestParam String email, @RequestParam String animalType,
			@RequestParam String concern) {
		Customer customer = new Customer(null, name, petName, phone, email, animalType, concern);
		try {
			repository.save(customer);
			Response response = new Response(101, "Patient details have been saved successfully.");
			return new ResponseEntity<Response>(response, HttpStatus.OK);
		} catch (Exception e) {
			Response response = new Response(701, "There was an error. Please try again.");
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
