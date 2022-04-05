package com.mama.springrestapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mama.springrestapi.model.Employee;
import com.mama.springrestapi.repository.EmployeeRepository2;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository2 eRepository;
	/*
	 * private static List<Employee> list = new ArrayList<>(); static { Employee e =
	 * new Employee(); e.setName("Rajalaxmi"); e.setAge(38); e.setDepartment("IT");
	 * e.setEmail("sweetraj545@gmail.com"); e.setLocation("Toronto"); list.add(e);
	 * 
	 * 
	 * e = new Employee(); e.setName("Sudhir"); e.setAge(43);
	 * e.setDepartment("Java"); e.setEmail("sudhir.senapati.com");
	 * e.setLocation("Oakvillle"); list.add(e);
	 */
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return eRepository.findAll();
	}
	public Employee saveEmployee(Employee employee) {
		return eRepository.save(employee);
	}
	public Employee getSingleEmployee(Long id) {
	Optional<Employee> employee = eRepository.findById(id);
	if(employee.isPresent()) {
		return employee.get();
	}
	throw new RuntimeException("Employee is not found "+id);
	}
	
    public void deleteEmployee(Long id) {
    	eRepository.deleteById(id);
    }
    
    public Employee updateEmployee(Employee employee) {
    	return eRepository.save(employee);
    	
    }
    }


	
