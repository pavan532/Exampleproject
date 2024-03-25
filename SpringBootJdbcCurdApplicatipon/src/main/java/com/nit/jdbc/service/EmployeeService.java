package com.nit.jdbc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.jdbc.Repositary.EmployeeRepositary;
import com.nit.jdbc.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepositary emprepo;

	public List<Employee> getAll() {

		List<Employee> emp = new ArrayList<Employee>();

		emprepo.findAll().forEach(employee -> emp.add(employee));

		return emp;

	}

	public Employee getemployeebyid(Long id) {
		
		return emprepo.findById(id).get(); 
	}
	
	public void SaveorUpdate(Employee emp) {
		
		emp.setBASELOCATION(emp.getBASELOCATION());
		emp.setEMPLOYEE_ASSIGNDPROJECTS(emp.getEMPLOYEE_ASSIGNDPROJECTS());
		emp.setEMPLOYEEBASELOCATION(emp.getEMPLOYEEBASELOCATION());
		emp.setEMPLOYEEEMAIL(emp.getEMPLOYEEEMAIL());
		emp.setEMPLOYEENAME(emp.getEMPLOYEENAME());
		
		emprepo.save(emp);
		
	}
	
	public void deletebyid(Long id) {
		
		emprepo.deleteById(id);
	}
	
}
