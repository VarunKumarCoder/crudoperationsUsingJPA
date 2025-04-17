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
		Doctor doc=new Doctor();
		doc.setDocName("sai5");
		doc.setIncome(155000.00);
		doc.setPlace("AUR");
		doc.setSpecialization("Brain");
		System.out.println(docService.register(doc));
		
		/*Optional<Doctor> doc=docService.getById(1);
		System.out.println(doc);*/
	}

	
	

}
