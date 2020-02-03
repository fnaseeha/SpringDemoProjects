package com.naseeha.training;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Value("${name}")
	private String employeeName;
	
	@Value("${city}")
	private String employeeCity;
	
	@Override
	public List<Employee> getAllEmployee(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName(employeeName);
		employee.setEmployeeLocation(employeeCity);
		employees.add(employee);
		return employees;
	}

}
