package com.nit.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.jdbc.entity.Employee;
import com.nit.jdbc.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/empgetall")
	private List<Employee> getALLEmp(){
		
		return service.getAll();
		
	}
	
	@GetMapping("emp/{id}")
	private Employee employee(@PathVariable(name = "id") Long id) {
		
		return service.getemployeebyid(id);
	}
	
	
	@DeleteMapping("/emp/{id}")
	private void deleteempid(@PathVariable(name = "id") Long id) {
		
		service.deletebyid(id);
	}
	
	@PostMapping("/saveupdate")//not working
	private Long saveorupdate(@RequestBody Employee emp) {
		
		service.SaveorUpdate(emp);
		return emp.getID();
	}
	
}
