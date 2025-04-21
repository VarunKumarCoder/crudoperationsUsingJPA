package com.cd.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.model.Company;
import com.cd.model.Customer;

@RestController
@RequestMapping("/complexdata")
public class CustomerOperationsController {

	@GetMapping("/report")
	public ResponseEntity<Customer> showComplexData(){
		Customer cust=new Customer(1001,"raja",6652.2f,new String[] {"Red","blue","green"},List.of("10th","Inter","B.tech"),Set.of(66666666L,2323232L,4545454L),Map.of("aadhar",454545L,"panNo",78787L), new Company("Samsung","HYD","Electronics",4));
	
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<Customer>(cust,status);
	}
}
