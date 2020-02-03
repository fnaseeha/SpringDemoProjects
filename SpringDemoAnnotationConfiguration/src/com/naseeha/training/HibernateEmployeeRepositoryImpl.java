package com.naseeha.training;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Override
	public List<Employee> getAllEmployee(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Naseeha");
		employee.setEmployeeLocation("Kandy");
		employees.add(employee);
		return employees;
	}

}
