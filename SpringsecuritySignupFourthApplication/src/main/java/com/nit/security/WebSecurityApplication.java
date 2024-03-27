package com.nit.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class WebSecurityApplication extends WebSecurityConfigurerAdapter{

	@Autowired
	private PasswordEncoder password;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.inMemoryAuthentication()
		.withUser("pavan")
		.password("$2a$10$/aJl.uYikRGiuT4aJf.mh.DDtghG4Q8J9yERBFk1tLUQSwnNLIYay")
		.roles("admin");
	}
}
