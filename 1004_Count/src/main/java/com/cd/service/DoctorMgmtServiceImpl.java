package com.cd.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
	public long getCount() {
		long count=doctorRepo.count();
		return count;
	}

	@Override
	public Doctor register(Doctor doctor) {
		Doctor doc=doctorRepo.save(doctor);
		return doc;
	}

	

	

	

}
