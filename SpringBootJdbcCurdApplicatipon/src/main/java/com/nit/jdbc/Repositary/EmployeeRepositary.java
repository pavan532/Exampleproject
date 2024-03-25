package com.nit.jdbc.Repositary;

import org.springframework.data.repository.CrudRepository;

import com.nit.jdbc.entity.Employee;

public interface EmployeeRepositary extends CrudRepository<Employee, Long>{

}
