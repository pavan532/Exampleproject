package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

	
	@ResponseBody
	@GetMapping("/hello")
	public String webpage() {
		
		return "Hello this is a Spring Security Framework";	
	}
	@ResponseBody
	@GetMapping("/hello1")
	public String webpage1() {
		
		return "Hello1 this is a Spring Security Framework";	
	}
	
	@ResponseBody
	@GetMapping("/hello2")
	public String webpage2() {
		
		return "Hello2 this is a Spring Security Framework";	
	}
	
	//Security Database Schema
}
