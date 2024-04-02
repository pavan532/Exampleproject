package com.nit.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class Appconfig {
	
	@Bean
	InternalResourceViewResolver Resourceresolver() {
		
		InternalResourceViewResolver Resourceresolver=new InternalResourceViewResolver();
		Resourceresolver.setPrefix("/WEB-INF/view/");
		Resourceresolver.setSuffix(".jsp");
		return Resourceresolver;
	}
	
	@Bean
	public JdbcTemplate templeate() {
		JdbcTemplate template=new JdbcTemplate(datasource());
		return template;
	}
	
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl("jdbc:mysql://localhost:3306/mydb");
		datasource.setUsername("root");
		datasource.setPassword("Pavan@532");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return datasource;
	}
	
	@Bean
	PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}

}
