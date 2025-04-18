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
	public List<Doctor> getAll(Doctor doctor, boolean ascOrder, String... props) {
		Sort sort=Sort.by(ascOrder?Direction.ASC:Direction.DESC, props);
		Example example=Example.of(doctor);
		List<Doctor> list=doctorRepo.findAll(example, sort);
		return list;
	}

	

	

	

	

	

	
	}

	
