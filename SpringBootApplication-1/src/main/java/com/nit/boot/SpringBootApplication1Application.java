package com.nit.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApplication1Application {

	public static void main(String[] args) {
		
		//SpringApplication.run(SpringBootApplication1Application.class, args);
		
		SpringApplication SpringApplication=new SpringApplication(SpringBootApplication1Application.class);

	    ConfigurableApplicationContext context= SpringApplication.run(args);
	    
	    Student stu=context.getBean(Student.class);
	    stu.Texting();
	}

   

}
