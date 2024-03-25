package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class MyAppConfig {
	
	@Bean
	InternalResourceViewResolver Viewresolver() {
		
		InternalResourceViewResolver viewresolver=new InternalResourceViewResolver();
		
		viewresolver.setPrefix("/WEB-INF/view/");
		viewresolver.setSuffix(".jsp");
		
		return viewresolver;
	}
	
//	@Bean
//	PasswordEncoder getpassword2() {
//		
//		return new BCryptPasswordEncoder();	//bcrypt calculator
//	}

}
