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
		Doctor doctor=new Doctor();	
		doctor.setDocName("Varun");
		doctor.setIncome(70000.00);
		doctor.setSpecialization("Hemotology");
		doctor.setPlace("HYD");
		String msg=docService.registerDoctor(doctor);
		System.out.println(msg);
	}

}
