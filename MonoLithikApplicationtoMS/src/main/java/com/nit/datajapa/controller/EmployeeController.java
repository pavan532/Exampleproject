package com.nit.datajapa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.datajapa.entity.EmployeeSpringboot;
import com.nit.datajapa.payload.EmployeeDto;
import com.nit.datajapa.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
//	@PostMapping()
//	public EmployeeDto createemp(@RequestBody EmployeeSpringboot emp) {
//		
//		return service.saveemployee(emp);
//	}
	
	@PostMapping()
	public ResponseEntity<?> createEmployee(@RequestBody EmployeeSpringboot emp) {
	    if (emp.getEmployeebaselocation() == null) {
	        return ResponseEntity.badRequest().body("Employee base location is required");
	    }

	    try {
	        EmployeeDto employeeDto = service.saveemployee(emp);
	        return ResponseEntity.ok(employeeDto);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save employee");
	    }
	}
	
	
	@GetMapping("/{employeeid}")
	public EmployeeDto getempbyid(
			@PathVariable(name = "employeeid") long employeeid
			){
		
		return service.getEmployeeByid(employeeid);
	}
//	 "id":101,
//	   "employeename":"pavan",
//	   "employeeemail":"Kalyan@gmail.com",
//	   "Baselocation":"Hydrabad",
//	   "employeeAssigndprojects":2
}
