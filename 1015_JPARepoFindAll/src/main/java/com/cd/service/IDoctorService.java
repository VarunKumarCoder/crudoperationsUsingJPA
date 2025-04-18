package com.cd.service;

import java.util.List;

import org.springframework.data.domain.Example;

import com.cd.entity.Doctor;

public interface IDoctorService {
	
	public List<Doctor> getAll(Doctor doctor,boolean ascOrder,String... props);
	
}
