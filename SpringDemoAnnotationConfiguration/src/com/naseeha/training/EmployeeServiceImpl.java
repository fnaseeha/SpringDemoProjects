package com.naseeha.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(){
		System.out.println("Default constructor called");
	}
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloaded constructor called");
		this.employeeRepository = employeeRepository;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter Injection called");
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.getAllEmployee();
	}

}
