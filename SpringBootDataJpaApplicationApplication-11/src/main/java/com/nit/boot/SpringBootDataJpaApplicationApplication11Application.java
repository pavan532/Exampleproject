package com.nit.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataJpaApplicationApplication11Application{

//	@Autowired
//	private servicerepositary repo;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con= SpringApplication.run(SpringBootDataJpaApplicationApplication11Application.class, args);
		
		ServiceRepositary bean=con.getBean(ServiceRepositary.class);
		
		bean.deleteById();
		
		System.out.println("Working Fine");
	}

	
	
	

}
