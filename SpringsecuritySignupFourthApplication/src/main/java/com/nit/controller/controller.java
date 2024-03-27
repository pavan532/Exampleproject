package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nit.dao.signupdao;
import com.nit.dto.CustomerDto;

@Controller
public class controller {

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private signupdao dao;
	
	@ResponseBody
	@GetMapping("/hello")
	public String webpage() {
		
		return "Hello this is a Spring Security Framework";	
	}
	
	@GetMapping("/loginpage")
	public String webpage4() {
		
		return "login";	
	}
	
	@GetMapping("/sign")
	public String webpage1(@ModelAttribute("custmer") CustomerDto custmer) {
		
		return "signup";	
	}
	
	@PostMapping("/process")
	public String webpage2(CustomerDto custmer) {
		
		System.out.println(custmer);
		
		String encode=encoder.encode(custmer.getPassword());
		custmer.setPassword(encode);
		System.out.println(encode);
		
		dao.save(custmer);
		
		return "redirect:/sign";	
	}
}
