package com.nit.datajapa.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.datajapa.entity.ProjectSpringboot;

public interface ProjectRepositary extends JpaRepository<ProjectSpringboot, Long>{

	ProjectSpringboot findByProjectcode(long projectCode);

}
