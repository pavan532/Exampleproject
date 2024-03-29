package com.nit.datajapa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.datajapa.entity.ProjectSpringboot;
import com.nit.datajapa.service.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

	@Autowired
	private ProjectService service;
	
	@PostMapping
	public ProjectSpringboot Createdproject(@RequestBody ProjectSpringboot project) {
		
		return service.saveproject(project);
	}
	
	@GetMapping("/{projectcode}")
	public ProjectSpringboot getprojectbycode(
			@PathVariable(name = "projectcode") long projectcode
			){
		
		return service.getprojectByid(projectcode);
	}
}
