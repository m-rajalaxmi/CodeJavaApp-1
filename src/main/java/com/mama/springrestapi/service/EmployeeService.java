package com.mama.springrestapi.service;

import java.util.List;

import com.mama.springrestapi.model.Employee;

public interface EmployeeService {
	List<Employee> getEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getSingleEmployee(Long id);
	
    void deleteEmployee(Long id);
    
    Employee updateEmployee(Employee employee);

	
	}
