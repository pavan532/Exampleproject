package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class logincontroller {

	
	@GetMapping("/Customlogin")
	public String webpage1() {
		
		return "Login";	
	}
	
	@GetMapping("/logout")
	public String webpage2() {
		
		return "ex";	
	}
}
