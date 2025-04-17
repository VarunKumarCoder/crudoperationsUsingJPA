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
	public Doctor register(Doctor doctor) {
		
		return doctorRepo.save(doctor);
	}

	
		
	}

	

	
	

	

	

	

}
