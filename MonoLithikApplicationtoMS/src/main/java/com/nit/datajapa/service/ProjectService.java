package com.nit.datajapa.service;

import com.nit.datajapa.entity.ProjectSpringboot;

public interface ProjectService {

	public ProjectSpringboot saveproject(ProjectSpringboot project);
	
	public ProjectSpringboot getprojectByid(long projectcode);
}
