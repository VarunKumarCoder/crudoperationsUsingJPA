package com.cd.service;

import java.util.List;

import com.cd.entity.Doctor;

public interface IDoctorService {
	
	public List<Doctor> showDoctorsByIncomeRange(double startRange, double endRange);
	
}
