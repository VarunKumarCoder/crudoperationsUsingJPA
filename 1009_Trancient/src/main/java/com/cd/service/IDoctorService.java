package com.cd.service;

import java.util.Optional;

import com.cd.entity.Doctor;

public interface IDoctorService {
	
	//public Doctor register(Doctor doctor);
	public Optional<Doctor> getById(Integer id);
}
