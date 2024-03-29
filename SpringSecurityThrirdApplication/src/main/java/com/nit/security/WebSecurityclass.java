package com.nit.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity(debug = true)
public class WebSecurityclass extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource datasource;
	
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(NoOpPasswordEncoder.getInstance());
}
	
}
