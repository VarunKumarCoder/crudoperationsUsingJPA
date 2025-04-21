package com.cd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.entity.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {

	@GetMapping("/report")
	public ResponseEntity<Customer> showData(){
		Customer cust=new Customer(1001,"raja",5412.0f);
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<Customer>(cust,status);
	}
}
