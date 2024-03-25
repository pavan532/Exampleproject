package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllerclass {

	
	@RequestMapping("/welcomepage")
	public String showpage(@ModelAttribute("student") Student student) {

		return "welcome";
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@RequestMapping("/result")
	public String resultpage(@RequestParam("name") String name, @ModelAttribute("student") Student student) {
		
		if (student.equals("pavan")) {

			System.out.println("hi welcome this is your page :"+name);
			
		} else {
			
			System.out.println(" this is Not your page :" + name);
		}
		return "view";
	}

}
