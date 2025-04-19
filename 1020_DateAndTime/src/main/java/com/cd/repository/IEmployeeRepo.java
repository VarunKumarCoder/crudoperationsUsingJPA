package com.cd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cd.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query(nativeQuery = true, value="SELECT YEAR(CURRENT_TIMESTAMP)-YEAR(DOB) FROM EMP_INFO WHERE EDESG=:job")
	public List<Integer> getEmployeeAgesByEDesg(String job);
}
