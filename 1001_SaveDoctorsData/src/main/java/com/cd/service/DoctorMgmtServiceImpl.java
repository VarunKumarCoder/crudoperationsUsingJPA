package com.cd.service;

import org.springframework.stereotype.Service;

import com.cd.entity.Doctor;
import com.cd.repository.IDoctorRepo;

@Service
public class DoctorMgmtServiceImpl implements IDoctorService {
	
	private IDoctorRepo doctorRepo;

	public DoctorMgmtServiceImpl(IDoctorRepo doctorRepo) {
		this.doctorRepo = doctorRepo;
	}

	@Override
	public String registerDoctor(Doctor doc) {
		Doctor doctor=doctorRepo.save(doc);
		return "Doctor Is Saved with the ID value of : "+doc.getId();
	}

}
