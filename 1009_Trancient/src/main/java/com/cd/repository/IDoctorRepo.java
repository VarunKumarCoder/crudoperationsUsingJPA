package com.cd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cd.entity.Doctor;

@Repository
public interface IDoctorRepo extends CrudRepository<Doctor, Integer> {

}
