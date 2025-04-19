package com.cd.service;

import java.util.List;

import com.cd.entity.Employee;

public interface IEmployeeService {
	//save method 
	public String saveEmployee(Employee employee);
	//findall method
	public List<Employee> getAllEmployees();
	//custom method with HQL/JPQL/Native SQL queries
	public List<Integer> showEmployeeAgesByEDesg(String desg);
}
