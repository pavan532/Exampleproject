package com.nit.datajapa.serviceimp;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.datajapa.entity.EmployeeSpringboot;
import com.nit.datajapa.entity.ProjectSpringboot;
import com.nit.datajapa.payload.EmployeeDto;
import com.nit.datajapa.repositary.EmployeeRepositary;
import com.nit.datajapa.repositary.ProjectRepositary;
import com.nit.datajapa.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeRepositary emprepo;
	
	@Autowired
	private ProjectRepositary projectrepo;
	
	
	@Override
	public EmployeeDto saveemployee(EmployeeSpringboot dto) {
		EmployeeSpringboot empsave=emprepo.save(dto);
		ProjectSpringboot project=projectrepo.findByProjectcode(empsave.getEmployeeAssigndprojects());
		
		EmployeeDto emp=new EmployeeDto();
		
		emp.setId(empsave.getId());
		emp.setEmployeename(empsave.getEmployeename());
		emp.setEmployeeemail(empsave.getEmployeeemail());
		emp.setEmployeebaselocation(empsave.getEmployeebaselocation());
		emp.setProjectcode(project.getProjectcode());
		emp.setProjectName(project.getProjectName());
		
		return emp;
	}

	@Override
	public EmployeeDto getEmployeeByid(long id) {
		
		EmployeeSpringboot Foundemp=emprepo.findById(id).get();
		ProjectSpringboot project=projectrepo.findByProjectcode(Foundemp.getEmployeeAssigndprojects());

          EmployeeDto emp=new EmployeeDto();
		
		emp.setId(Foundemp.getId());
		emp.setEmployeename(Foundemp.getEmployeename());
		emp.setEmployeeemail(Foundemp.getEmployeeemail());
		emp.setEmployeebaselocation(Foundemp.getEmployeebaselocation());
		emp.setProjectcode(project.getProjectcode());
		emp.setProjectName(project.getProjectName());
		
		return emp;
	}

}
