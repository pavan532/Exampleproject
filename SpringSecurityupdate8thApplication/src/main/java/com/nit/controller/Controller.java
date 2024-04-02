package com.nit.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.Dto.UserDto;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private JdbcUserDetailsManager userdetails;
	
	@GetMapping("/updatepage")
	public String page(@ModelAttribute("userdto") UserDto userdto) {
		
		return "update";
	}

	//s@ResponseBody
	@PostMapping("/updateuser")
	public String updatepage(UserDto user) {
		//JdbcUserDetailsManager jdbc = new JdbcUserDetailsManager(datasource);
		if (userdetails.userExists(user.getUsername())) {
			
		ArrayList<GrantedAuthority> auth=new ArrayList<GrantedAuthority>();
		
		SimpleGrantedAuthority roles= new SimpleGrantedAuthority("USER");
		auth.add(roles);
		
		UserDetails userdetils=new User(user.getUsername(), user.getPassword(),auth);
		userdetails.updateUser(userdetils);
		
		return "show";
		
		}else {
			
			return "update";
		}
	}
}
