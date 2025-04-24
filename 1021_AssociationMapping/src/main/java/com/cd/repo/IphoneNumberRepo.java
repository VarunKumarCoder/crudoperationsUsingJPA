package com.cd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.entity.PhoneNumber;

public interface IphoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

}
