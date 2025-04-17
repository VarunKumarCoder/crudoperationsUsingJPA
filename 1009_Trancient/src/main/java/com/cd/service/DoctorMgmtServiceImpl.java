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

	@Override
	public String registerOrUpdateDoctor(Doctor doctor) {
		//Call Original Method
		Optional<Doctor> opt=doctorRepo.findById(doctor.getId());
		if(opt.isPresent()) {
			doctorRepo.save(doctor);
			return doctor.getId()+" Doctor Details are Found and updated";
		}
		else {
			return "Doctor is saved with id Value: "+doctorRepo.save(doctor).getId();
		}
		
	}

	

	
	

	

	

	

}
