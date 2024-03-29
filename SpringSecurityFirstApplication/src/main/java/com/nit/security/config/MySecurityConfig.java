package com.nit.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity(debug = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

//	@Autowired
//	private PasswordEncoder bcryptpasswordEncoder;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("pavan")
		.password("{noop}1234")//1234
		.roles("admin");
		
		
		//System.out.println("pavan1234 Enocded code convert into bcrypt code :"+bcryptpasswordEncoder.encode("pavan1234"));
	}

//no need to written below two methods And autowired PasswordEncoder use this below format 	
//password("{noop}1234")	
//password("{bcrypt}$2a$10$J0msLrX8tmtbXAyIbj49J.oHzpNx4YZXXxjjh2o5QqdeNcOzXAnvu")//1234
	
//	@Bean
//	PasswordEncoder getpassword() {
//		
//		return NoOpPasswordEncoder.getInstance();
	
//	}//to show password in encrypt coder format(1234)
	
//	@Bean
//	PasswordEncoder getpassword2() {
//		
//		return new BCryptPasswordEncoder();	//bcrypt calculator
	
//	}//to show password in bcrypt coder format means ($2a$10$J0msLrX8tmtbXAyIbj49J.oHzpNx4YZXXxjjh2o5QqdeNcOzXAnvu)
	
}
