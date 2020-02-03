package com.naseeha.training;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.naseeha.training")
@PropertySource("application.properties")
public class ApplicationConfiguration {

	//member Injection
	@Bean(name="employeeService")
	@Scope("prototype")
	public EmployeeService getEmployeeService(){
		return new EmployeeServiceImpl();
	}
	
	@Bean
	public static PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer(){
		return new PropertyPlaceholderConfigurer();
	}
	//setter injection
	/*@Bean(name="employeeService")
	public EmployeeService getEmployeeService(){
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		employeeServiceImpl.setEmployeeRepository(getEmployeeRepository());
		return employeeServiceImpl;
	}
	*/
	//Constructor injection
	/*	@Bean(name="employeeService")
		public EmployeeService getEmployeeService(){
			EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl(getEmployeeRepository());
			return employeeServiceImpl;
		}*/
	
/*	@Bean(name="employeeRepository")
	public EmployeeRepository getEmployeeRepository(){
		return new HibernateEmployeeRepositoryImpl();
	}*/
}























