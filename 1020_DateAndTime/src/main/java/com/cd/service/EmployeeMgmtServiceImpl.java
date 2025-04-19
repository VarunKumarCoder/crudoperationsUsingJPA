package com.cd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cd.entity.Employee;
import com.cd.repository.IEmployeeRepo;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeService {
	
	private IEmployeeRepo empRepo;

	public EmployeeMgmtServiceImpl(IEmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}

	@Override
	public String saveEmployee(Employee employee) {
		int idVal=empRepo.save(employee).getId();
		return "Employee Object is saved with ID Value :: "+idVal;
	}

	@Override
	public List<Employee> getAllEmployees() {
			return empRepo.findAll();
	}

	@Override
	public List<Integer> showEmployeeAgesByEDesg(String desg) {
		return empRepo.getEmployeeAgesByEDesg(desg);
	}

	

	
	

	

	

	

	

	

	

	
	}

	
