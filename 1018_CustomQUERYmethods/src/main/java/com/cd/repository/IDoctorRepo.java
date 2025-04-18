package com.cd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cd.entity.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

	//@Query("FROM Doctor WHERE income>=?1 AND income<=?2")
	//@Query("FROM com.cd.entity.Doctor WHERE income>=?1 AND income<=?2")
	//@Query("FROM Doctor doc WHERE doc.income>=?1 AND doc.income<=?2")
	//@Query("FROM Doctor WHERE income>=:startRange AND income<=:endRange")
	//public List<Doctor> searchDoctorsByIncomeRange(double startRange, double endRange);
	
	@Query("FROM Doctor WHERE income>=:Start AND income<=:end")
	public List<Doctor> searchDoctorsByIncomeRange(@Param("Start") double startRange, @Param("end") double endRange);
}
