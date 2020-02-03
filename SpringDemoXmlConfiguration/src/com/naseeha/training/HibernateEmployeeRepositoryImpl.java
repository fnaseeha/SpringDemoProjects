package com.naseeha.training;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	/* (non-Javadoc)
	 * @see com.naseeha.training.EmployeeRepository#getAllEmployee()
	 */
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
