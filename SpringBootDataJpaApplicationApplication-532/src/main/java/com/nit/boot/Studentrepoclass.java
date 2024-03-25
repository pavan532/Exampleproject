package com.nit.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class Studentrepoclass {

	@Autowired
	private Studentrepointerface repo;
	
	public void save() {
		
		employee e=new employee();
		
		e.setId(532);
		e.setName("pavan");
		e.setSalary(2000000);
		
		repo.save(e);
		System.out.println("Employee saved successfully.");
	}
	
}
