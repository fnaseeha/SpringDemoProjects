package com.naseeha.training;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		EmployeeService employeeService = applicationContext.
				getBean("employeeService",EmployeeService.class);
		
		EmployeeService employeeService2 = applicationContext.
				getBean("employeeService",EmployeeService.class);
		
		//scope check
		System.out.println(employeeService);
		System.out.println(employeeService2);
		
		
		List<Employee> employees = employeeService.getAllEmployee();
		
		for(Employee emp: employees){
			System.out.println(emp.getEmployeeName()+" at "+emp.getEmployeeLocation());
		}
		
		
	}

}
