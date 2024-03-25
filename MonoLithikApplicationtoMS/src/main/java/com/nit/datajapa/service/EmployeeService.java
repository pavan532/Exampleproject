package com.nit.datajapa.service;

import com.nit.datajapa.entity.EmployeeSpringboot;
import com.nit.datajapa.payload.EmployeeDto;

public interface EmployeeService {
	
	public EmployeeDto saveemployee(EmployeeSpringboot dto);
	public EmployeeDto getEmployeeByid(long id);

}
