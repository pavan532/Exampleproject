package com.nit.datajapa.Serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.datajapa.Entity.EmployeeEntity;
import com.nit.datajapa.Entity.ProjectEntity;
import com.nit.datajapa.Payload.EmployeeandprojectDto;
import com.nit.datajapa.Repositary.EmployeeRepositary;
import com.nit.datajapa.Repositary.ProjectRepositary;
import com.nit.datajapa.Service.Employeservice;

@Service
public class EmployeeserviceImp implements Employeservice{

	@Autowired
	private EmployeeRepositary emprepo;
	
	@Autowired
	private ProjectRepositary projectrepo;
	
	
	@Override
	public EmployeeandprojectDto saveemployee(EmployeeEntity dto) {
		
		EmployeeEntity empsave= emprepo.save(dto);
		ProjectEntity foundproject= projectrepo.findByProjectcode(empsave.getEmployeeAssigndprojects());
		
		EmployeeandprojectDto empdto=new EmployeeandprojectDto();
		empdto.setId(empsave.getId());
		empdto.setEmployeename(empsave.getEmployeename());
		empdto.setEmployeeemail(empsave.getEmployeeemail());
		empdto.setEmployeeAssigndprojects(empsave.getEmployeeAssigndprojects());
		empdto.setEmployeebaselocation(empsave.getEmployeebaselocation());
		empdto.setProjectcode(foundproject.getProjectcode());
		empdto.setProjectName(foundproject.getProjectName());
		
		
		return empdto;
	}

	@Override
	public EmployeeandprojectDto getEmployeeByid(long id) {
	
		EmployeeEntity foundemp=emprepo.findById(id).get();
		ProjectEntity foundproject= projectrepo.findByProjectcode(foundemp.getEmployeeAssigndprojects());

		EmployeeandprojectDto empdto=new EmployeeandprojectDto();
		empdto.setId(foundemp.getId());
		empdto.setEmployeename(foundemp.getEmployeename());
		empdto.setEmployeeemail(foundemp.getEmployeeemail());
		empdto.setEmployeeAssigndprojects(foundemp.getEmployeeAssigndprojects());
		empdto.setEmployeebaselocation(foundemp.getEmployeebaselocation());
		empdto.setProjectcode(foundproject.getProjectcode());
		empdto.setProjectName(foundproject.getProjectName());
		
		return empdto;
	}

}
