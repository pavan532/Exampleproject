package com.nit.datajapa.Service;

import com.nit.datajapa.Entity.EmployeeEntity;
import com.nit.datajapa.Payload.EmployeeandprojectDto;

public interface Employeservice {

	public EmployeeandprojectDto saveemployee(EmployeeEntity dto);
	public EmployeeandprojectDto getEmployeeByid(long id);
}
