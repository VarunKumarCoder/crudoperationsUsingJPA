package com.cd.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cd.entity.Employee;
import com.cd.repository.IEmployeeRepo;
import com.cd.service.IEmployeeService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeService docService;
	
	@Autowired
	private IEmployeeRepo docRepo;

	@Override
	public void run(String... args) throws Exception {
		Employee emp=new Employee(null, "Komal","Manager",LocalDateTime.of(1990,10,20,11,34),LocalTime.of(17, 45),LocalDate.of(2020, 10, 30));
		String result=docService.saveEmployee(emp);
		System.out.println(result);
		
		System.out.println("____________________________");
		
		docService.getAllEmployees().forEach(System.out::println);
		
		System.out.println("________________________________");
		
		docService.showEmployeeAgesByEDesg("Clerk").forEach(System.out::println);
}

	

	
	

}
