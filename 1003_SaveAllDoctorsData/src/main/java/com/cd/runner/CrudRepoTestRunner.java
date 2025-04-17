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
		
		Doctor doc1=new Doctor(null, "Sergion","Mahesh",60000.00,"AUR");
		Doctor doc2=new Doctor(null, "Sergion","suresh",70000.00,"BHR");
		Doctor doc3=new Doctor(null, "Dentist","Ramesh",80000.00,"AUR");
		List<Doctor> list=List.of(doc1,doc2,doc3);
		String msg=docService.registerAll(list);
		System.out.println(msg);
	}

	

}
