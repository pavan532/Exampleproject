package com.nit.datajapa.Serviceimp;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.datajapa.Entity.ProjectEntity;
import com.nit.datajapa.Repositary.ProjectRepositary;
import com.nit.datajapa.Service.Projectservice;

@Service
@Transactional
public class ProjectserviceImp implements Projectservice{

	@Autowired
	private ProjectRepositary projectrepo;
	
	@Override
	public ProjectEntity saveproject(ProjectEntity project) {
		
		ProjectEntity projectsave= projectrepo.save(project);
		
		return projectsave;
	}

	@Override
	public ProjectEntity getprojectByid(long projectcode) {
		ProjectEntity code = projectrepo.findByProjectcode(projectcode);
		return code;
	}

}
