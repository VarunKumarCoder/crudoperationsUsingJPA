package com.cd.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.model.Customer;

@RestController
@RequestMapping("/requestbody")
public class CustomerOperationsController {

	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer cust) {
		return cust.toString();
	}
}
