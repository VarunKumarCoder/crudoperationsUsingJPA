package com.cd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cd.entity.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

}
