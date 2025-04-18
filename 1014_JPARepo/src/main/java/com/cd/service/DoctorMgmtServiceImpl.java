package com.cd.service;

import org.springframework.stereotype.Service;

import com.cd.repository.IDoctorRepo;

@Service
public class DoctorMgmtServiceImpl implements IDoctorService {
	
	private IDoctorRepo doctorRepo;

	public DoctorMgmtServiceImpl(IDoctorRepo doctorRepo) {
		this.doctorRepo = doctorRepo;
	}

	@Override
	public void removeAllByIdBatch(Iterable<Integer> ids) {
		doctorRepo.deleteAllByIdInBatch(ids);
		
	}

	

	

	

	
	}

	
