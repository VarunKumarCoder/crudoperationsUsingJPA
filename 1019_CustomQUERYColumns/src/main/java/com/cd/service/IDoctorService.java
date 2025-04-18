package com.cd.service;

import java.util.List;

import com.cd.entity.Doctor;

public interface IDoctorService {
	
	public List<Doctor> findDoctorsBySpecialization(String s1, String s2);
	public List<Object[]> searchDoctorByIncome(double start, double end);
	public List<String> searchallDoctorNamebyIncomeRange(double min,double max);
}
