package com.nit.datajapa.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.datajapa.entity.EmployeeSpringboot;

public interface EmployeeRepositary extends JpaRepository<EmployeeSpringboot, Long>{

}
