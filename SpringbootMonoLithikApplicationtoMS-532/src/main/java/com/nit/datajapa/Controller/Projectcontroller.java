package com.nit.datajapa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.datajapa.Entity.ProjectEntity;
import com.nit.datajapa.Service.Projectservice;

@RestController
@RequestMapping("/api/project")
public class Projectcontroller {

	@Autowired
	private Projectservice service;
	
	@PostMapping
	public ProjectEntity savedata(@RequestBody ProjectEntity save) {
		
		return service.saveproject(save);
	}
	
	@GetMapping("/{id}")
	public ProjectEntity getid(
			@PathVariable(name = "id") long id
			) {
		
		return service.getprojectByid(id);
	}
}
