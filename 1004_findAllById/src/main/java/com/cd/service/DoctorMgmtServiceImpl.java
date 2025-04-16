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
	public Iterable<Doctor> getAllById(Iterable<Integer> ids) {
		Iterable<Doctor> doc=doctorRepo.findAllById(ids);
		return doc;
	}

	

	

	

	

	

}
