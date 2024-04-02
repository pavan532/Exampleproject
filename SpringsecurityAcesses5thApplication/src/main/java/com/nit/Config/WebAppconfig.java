package com.nit.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class WebAppconfig {
	
	@Bean
	InternalResourceViewResolver ViewResolver() {
		InternalResourceViewResolver ViewResolver=new InternalResourceViewResolver();
		ViewResolver.setPrefix("/WEB-INF/view/");
		ViewResolver.setSuffix(".jsp");
		return ViewResolver;
	}
	
	@Bean
	public JdbcTemplate jdbctemplate() {
		JdbcTemplate jdbctemplate=new JdbcTemplate(datasource());
		return jdbctemplate;
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

}
