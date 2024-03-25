package com.nit.datajapa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.datajapa.Service.EmployeeService;
import com.nit.datajapa.entity.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
//	//@RequestMapping(value = "/add/employee",method = RequestMethod.GET)
//	@PostMapping("/add/employee")
//	public com.nit.datajapa.entity.Employee addEmployee(
//			@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName) {
//		
//		return service.creeateEmp(empId, firstName, secondName);
//	}
	
	@PostMapping("/add/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.creeateEmp(employee.getEmpId(), employee.getFirstName(), employee.getSecondName());
    }
	
	//@RequestMapping(value = "/remove/employee", method = RequestMethod.GET) 
	@DeleteMapping("/remove/{empId}")
	public String removeEmployee( @PathVariable(value = "empId") String empId)   
	{  
		service.deleteEmployee(empId);  
	return "Employee removed";
	}

}
