package com.naseeha.training;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(){}
	
	//constructor injection
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.getAllEmployee();
	}

}
