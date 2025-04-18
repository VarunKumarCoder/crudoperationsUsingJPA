package com.cd.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cd.repository.IDoctorRepo;
import com.cd.service.IDoctorService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	
	@Autowired
	private IDoctorService docService;
	
	@Autowired
	private IDoctorRepo docRepo;

	@Override
	public void run(String... args) throws Exception {
		
		docService.showDoctorsByIncomeRange(17000.00, 20000.00).forEach(System.out::println);
		
	}

	

	
	

}
