package com.cd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cd.entity.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

	//public List<Doctor> findByDocNameEquals(String name);
	//public List<Doctor> findBydocNameStartingWith(char chares);
	//public Iterable<Doctor> findBydocNameEndingWith(char chars);
	public Iterable<Doctor> findBydocNameContaining(String name);
}
