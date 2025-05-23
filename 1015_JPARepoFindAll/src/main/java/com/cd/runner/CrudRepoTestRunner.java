package com.cd.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.cd.entity.Doctor;
import com.cd.service.IDoctorService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	
	@Autowired
	private IDoctorService docService;

	@Override
	public void run(String... args) throws Exception {
		Doctor doc=new Doctor();
		doc.setSpecialization("mouth");
		doc.setIncome(17000.00);
		docService.getAll(doc, true, "income").forEach(System.out::println);
		
	}

	

	
	

}
