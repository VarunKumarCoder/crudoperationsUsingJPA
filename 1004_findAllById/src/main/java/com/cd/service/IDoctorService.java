package com.cd.service;

import com.cd.entity.Doctor;

public interface IDoctorService {
	
	
	public Iterable<Doctor> getAllById(Iterable<Integer> ids);
}
