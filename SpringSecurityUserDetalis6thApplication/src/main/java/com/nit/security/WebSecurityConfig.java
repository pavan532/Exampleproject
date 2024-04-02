package com.nit.security;

import java.util.ArrayList;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity(debug = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		InMemoryUserDetailsManager detalis=new InMemoryUserDetailsManager();
		
		ArrayList<GrantedAuthority> roles=new ArrayList<GrantedAuthority>();
		
		SimpleGrantedAuthority role=new SimpleGrantedAuthority("Admin");
		SimpleGrantedAuthority role2=new SimpleGrantedAuthority("User");
		
		roles.add(role);
		roles.add(role2);
//		
//
		User user=new User("pavan","{noop}1234",roles);
		
//		UserDetails user =User.withUsername("pavan").password("{noop}1234").roles("ADMIN").build();
//		UserDetails user1 =User.withUsername("kumar").password("{noop}123").roles("User").build();
		detalis.createUser(user);
//		detalis.createUser(user1);
		
		auth.userDetailsService(detalis);
	}

}
