package com.nit.controller;

import java.security.Principal;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nit.dto.ChangePassworddto;
import com.nit.dto.UserDto;
import com.nit.service.Usreservice;

@Controller
public class controller {

	@Autowired
	private Usreservice service;

	@Autowired
	private DataSource datasource;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private JdbcUserDetailsManager jdbcuserdetailsmanager;

//	@Autowired
//	private UserDto dto;

	@ResponseBody
	@GetMapping("/come")
	public String welcome() {

		return "Welcome to Web Security";
	}

	@GetMapping("/loginpage")
	public String LoginPage(@ModelAttribute("user") UserDto user) {

		return "login";
	}

	@PostMapping("/save-page")
	public String Saveuser(UserDto user) {

		JdbcUserDetailsManager jdbc = new JdbcUserDetailsManager();
		jdbc.setDataSource(datasource);
		// UserDetails user =
		// User.withUsername(dto.getUsername()).password(dto.getPassword()).roles("ADMIN").build();
		UserDetails user1 = User.withUsername(user.getUsername()).password(user.getPassword()).authorities("ADMIN")
				.build();
		jdbc.createUser(user1);

		System.out.println("Saves User Details....");
		// service.Saveuser(dto);

		return "saveuser";
	}

	@GetMapping("/deleteform")
	public String deletepage(@ModelAttribute("user") UserDto user) {

		return "delete";
	}

	@GetMapping("/deleteuser")
	public String deleteuser(UserDto user) {

		JdbcUserDetailsManager jdbc = new JdbcUserDetailsManager(datasource);
		// jdbc.setDataSource(datasource);
		jdbc.deleteUser(user.getUsername());

		System.out.println("deleted User Susessfully... :");

		return "redirect:/loginpage";
	}

	@GetMapping("/changepass")
	public String Changepasswordpage(Model model) {

		model.addAttribute("changepassword", new ChangePassworddto());

		return "changepassword";
	}

	@PostMapping("/password-save")
	public String savepasswordpage(Principal princi, ChangePassworddto change) {

//		JdbcUserDetailsManager match=new JdbcUserDetailsManager(datasource);
//		UserDetails user= match.loadUserByUsername(princi.getName());

		UserDetails user = jdbcuserdetailsmanager.loadUserByUsername(princi.getName());

		boolean matches = passwordEncoder.matches(change.getOldPassword(), user.getPassword());

		if (!change.getNewpassword().equals(change.getConfirmpassword())) {

			return "redirect:/changepass?doesnotmatch";
		}

		if (matches) {
			JdbcUserDetailsManager jdbc = new JdbcUserDetailsManager(datasource);
			jdbc.changePassword(change.getOldPassword(), change.getNewpassword());

			System.out.println(change);
			System.out.println("password is Change....");

			return "redirect:/loginpage";
		}

		System.out.println("is Not Currect Old password");

		return "redirect:/changepass?invalidpassword";
	}

}
