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
		boolean doc=docService.presentById(2);
		if(doc) {
			System.out.println("Doctor is Available  With Given ID : ");
		}
		else {
			System.out.println("Doctor is Not Available with the Given ID");
		}
	}

}
