package com.nit.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDataJpaApplicationApplication532Application {

	public static void main(String[] args) {
		 //employee e;
		
		ConfigurableApplicationContext con= SpringApplication.run(SpringBootDataJpaApplicationApplication532Application.class, args);
		System.out.println("workingfine");
		
		Studentrepoclass bean= con.getBean(Studentrepoclass.class);
		
		//employee e=new employee();
	
		bean.save();
		
		System.out.println("inserted ...........");
		
	}

}
