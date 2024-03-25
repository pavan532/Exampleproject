package com.nit.datajapa.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.datajapa.Entity.EmployeeEntity;

public interface EmployeeRepositary extends JpaRepository<EmployeeEntity, Long>{

}
