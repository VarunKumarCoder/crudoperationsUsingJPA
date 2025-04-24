package com.cd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.entity.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

}
