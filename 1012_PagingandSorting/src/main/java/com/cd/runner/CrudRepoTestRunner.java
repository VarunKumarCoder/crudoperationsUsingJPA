package com.cd.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cd.entity.Doctor;
import com.cd.service.IDoctorService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	
	@Autowired
	private IDoctorService docService;

	@Override
	public void run(String... args) throws Exception {
		Iterable<Doctor> doc=docService.getAllBySorting(false, "docName");
		doc.forEach(doctor -> System.out.println(doctor));
	}

	
	

}
