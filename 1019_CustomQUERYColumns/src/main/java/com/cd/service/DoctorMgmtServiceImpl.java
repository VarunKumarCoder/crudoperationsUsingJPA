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
	public List<Doctor> findDoctorsBySpecialization(String s1, String s2) {
		List<Doctor> doc=doctorRepo.searchDoctorBySpecialization(s1, s2);
		return doc;
	}

	@Override
	public List<Object[]> searchDoctorByIncome(double start, double end) {
		List<Object[]> list=doctorRepo.searchDoctorDataByIncome(start, end);
		return list;
	}

	@Override
	public List<String> searchallDoctorNamebyIncomeRange(double min, double max) {
		List<String> list=doctorRepo.searchAllDoctorNamesByIncomerange(min, max);
		return list;
	}

	
	

	

	

	

	

	

	

	
	}

	
