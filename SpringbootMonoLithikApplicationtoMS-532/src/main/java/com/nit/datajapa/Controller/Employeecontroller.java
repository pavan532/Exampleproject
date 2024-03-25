package com.nit.datajapa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.datajapa.Entity.EmployeeEntity;
import com.nit.datajapa.Payload.EmployeeandprojectDto;
import com.nit.datajapa.Service.Employeservice;

@RestController
@RequestMapping("/api/employee")
public class Employeecontroller {

	@Autowired
	private Employeservice service;
	
	@PostMapping
	public EmployeeandprojectDto savedata(@RequestBody EmployeeEntity save) {
		return service.saveemployee(save);
	}
	
	@GetMapping("/{employyeid}")
	public EmployeeandprojectDto getid(
			@PathVariable(name = "employyeid") long employyeid
			) {
		return service.getEmployeeByid(employyeid);
	}
	
//	"employeeemail":"pavan@gmail.com",
//    "employeename":"pavan",
//   "employeeAssigndprojects":101,
//     "employeebaselocation":"Tenali"
}