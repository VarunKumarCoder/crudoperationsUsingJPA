package com.cd.service;

import java.util.List;

import org.springframework.data.domain.Example;
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
	public Doctor fetchById(Integer id) {
		Doctor doctor=doctorRepo.getReferenceById(id);
		return doctor;
	}

	

	

	

	

	

	

	
	}

	
