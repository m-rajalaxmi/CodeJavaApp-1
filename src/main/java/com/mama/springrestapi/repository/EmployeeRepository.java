package com.mama.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mama.springrestapi.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	
	
}
