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
	public String registerAll(List<Doctor> doctors) {
		Iterable<Doctor> list=doctorRepo.saveAll(doctors);
		List<Integer> ids=StreamSupport.stream(list.spliterator(),false)
										.map(Doctor::getId)
										.collect(Collectors.toList());
		return ids.size()+" No. of doctors are saved"+ids;
	}

	

	

}
