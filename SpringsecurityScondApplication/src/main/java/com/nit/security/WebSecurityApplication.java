package com.nit.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity(debug = true)
public class WebSecurityApplication extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.inMemoryAuthentication()
		.withUser("pavan")
		.password("{noop}1234")
		.roles("admin")
		.and()
		.withUser("raju").password("{noop}5632").roles("user");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/hello").authenticated()
		.antMatchers("/hello1").authenticated()
		.antMatchers("/hello2").permitAll()
		.and()
		.formLogin().loginPage("/Customlogin")
		.and()
		.httpBasic()
		.and()
		.logout();
		
		/*
		 are using any requests hitting browser show in secure page
		 http.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.and()
		.httpBasic();*/
	}
}
