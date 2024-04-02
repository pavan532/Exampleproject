package com.nit.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class Appconfigure {
	
	@Bean
	InternalResourceViewResolver viewResource() {
		InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
		viewresolver.setPrefix("/WEB-INF/view/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;
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
	public PasswordEncoder passwordencoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	public JdbcUserDetailsManager jdbcuserdetailsmanger() {
		
		JdbcUserDetailsManager jdbc=new JdbcUserDetailsManager(datasource());
		return jdbc;
	}
}
