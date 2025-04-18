package com.cd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cd.entity.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

	@Query("FROM Doctor WHERE Specialization IN(:s1,:s2) ORDER BY Specialization")
	public List<Doctor> searchDoctorBySpecialization(String s1, String s2);
	
	@Query("SELECT id,docName,income FROM Doctor WHERE income between :start and :end")
	public List<Object[]> searchDoctorDataByIncome(double start, double end);
	
	@Query("SELECT docName FROM Doctor WHERE income between :min and :max")
	public List<String> searchAllDoctorNamesByIncomerange(double min,double max);
}
