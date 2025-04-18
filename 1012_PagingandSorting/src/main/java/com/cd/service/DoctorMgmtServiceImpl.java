package com.cd.service;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public Iterable<Doctor> getAllBySorting(boolean asc,String... props) {
		Sort sort1=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		Iterable<Doctor> doctors=doctorRepo.findAll(sort1);
		return doctors;
	}

	
	}

	
