package com.nit.datajapa.Service;

import com.nit.datajapa.Entity.ProjectEntity;

public interface Projectservice {

	public ProjectEntity saveproject(ProjectEntity project);
	
	public ProjectEntity getprojectByid(long projectcode);
}
