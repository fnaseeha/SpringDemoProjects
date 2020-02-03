package com.naseeha.training;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
		
		List<Employee> employees = employeeService.getAllEmployee();
		
		for(Employee emp: employees){
			System.out.println(emp.getEmployeeName()+" at "+emp.getEmployeeLocation());
		}
		
		
	}

}
