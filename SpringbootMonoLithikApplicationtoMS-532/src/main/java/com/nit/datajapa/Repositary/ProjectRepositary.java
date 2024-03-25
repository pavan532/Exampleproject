package com.nit.datajapa.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.datajapa.Entity.ProjectEntity;


public interface ProjectRepositary extends JpaRepository<ProjectEntity, Long>{

	ProjectEntity findByProjectcode(long projectCode);
}
