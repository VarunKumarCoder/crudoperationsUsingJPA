package com.cd.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cd.entity.Doctor;
import com.cd.repository.IDoctorRepo;

@Service
public class DoctorMgmtServiceImpl implements IDoctorService {
	
	private IDoctorRepo doctorRepo;

	public DoctorMgmtServiceImpl(IDoctorRepo doctorRepo) {
		this.doctorRepo = doctorRepo;
	}

	/*@Override
	public Optional<Doctor> getById(Integer id) {
		
		return doctorRepo.findById(id);
	}*/

	@Override
	public Doctor register(Doctor doctor) {
		
		return doctorRepo.save(doctor);
	}
		
	
	}

	
