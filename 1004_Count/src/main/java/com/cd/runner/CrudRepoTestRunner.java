package com.cd.runner;

import java.util.List;

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
		//Long count=docService.getCount();
		//System.out.println(count);
		Doctor doctor=new Doctor();
		doctor.setDocName("Kumar");
		doctor.setIncome(600000.00);
		doctor.setSpecialization("Cardio");
		doctor.setPlace("VZG");
		Doctor doc=docService.register(doctor);
	}

	

}
