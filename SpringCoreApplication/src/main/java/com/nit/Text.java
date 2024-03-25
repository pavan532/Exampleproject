package com.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee employe=con.getBean("emp",Employee.class);
		
		employe.display();
		
		((ClassPathXmlApplicationContext) con).close();
	}

}
