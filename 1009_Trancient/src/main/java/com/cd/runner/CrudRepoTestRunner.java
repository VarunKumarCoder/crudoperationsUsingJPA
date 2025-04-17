package com.cd.runner;

import java.util.Optional;

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
		/*Doctor doc=new Doctor();
		doc.setDocName("Reh");
		doc.setIncome(14000.00);
		doc.setPlace("MBI");
		doc.setSpecialization("Trauma");
		System.out.println(docService.register(doc));*/
		
		Optional<Doctor> doc=docService.getById(1);
		System.out.println(doc);
	}

	
	

}
