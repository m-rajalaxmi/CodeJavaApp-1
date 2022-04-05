package com.mama.springrestapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mama.springrestapi.model.Employee;
import com.mama.springrestapi.service.EmployeeService;

@RestController
public class EmpController {
	
	@Autowired
	private EmployeeService eService;
			
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		System.out.println("Fetching emp data");
		return  eService.getEmployees();
		}
    @GetMapping("/employees/{id}")
    public Employee getEmpolyee(@PathVariable Long id) {
	return eService.getSingleEmployee(id);
}
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
	return  eService.saveEmployee(employee);
}


    @DeleteMapping("/employees")
    public void deleteEmployee(@RequestParam Long id) {
     eService.deleteEmployee(id);
    }
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee) {
	
    	return  eService.updateEmployee(employee);
}

}
