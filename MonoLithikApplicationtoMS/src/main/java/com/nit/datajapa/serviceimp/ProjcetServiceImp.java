package com.nit.datajapa.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.datajapa.entity.ProjectSpringboot;
import com.nit.datajapa.repositary.ProjectRepositary;
import com.nit.datajapa.service.ProjectService;

@Service
public class ProjcetServiceImp implements ProjectService{

	@Autowired
	private ProjectRepositary projectrepo;
	
	@Override
	public ProjectSpringboot saveproject(ProjectSpringboot project) {
		ProjectSpringboot save=projectrepo.save(project);
		return save;
	}

	@Override
	public ProjectSpringboot getprojectByid(long projectcode) {
		ProjectSpringboot Foundproject=projectrepo.findByProjectcode(projectcode);
		return Foundproject;
	}

}