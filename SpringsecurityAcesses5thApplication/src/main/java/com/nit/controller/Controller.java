package com.nit.controller;

import java.security.Principal;
import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/mapping")
	public String Homepage(Principal principle,Authentication auth,Model model) {
		
		String username = principle.getName();
		System.out.println("UserName is :"+username);
		
		Collection<? extends GrantedAuthority> autharity=auth.getAuthorities();
		System.out.println(autharity);
		
		model.addAttribute("username", username);
		model.addAttribute("autharity", autharity);
		
		return "home";
	}
	
	
	@GetMapping("/Admin")
	public String Adminpage() {
		
		return "admin";
	}
	
	@GetMapping("/roles")
	public String userpage() {
		
		return "roles";
	}
	
	@GetMapping("/Acsses")
	public String errorpage() {
		
		return "error";
	}
}
