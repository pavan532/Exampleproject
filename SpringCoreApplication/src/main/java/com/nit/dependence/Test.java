package com.nit.dependence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("dependency.xml");
		
		Employee em=context.getBean("emp",Employee.class);
		em.show();
		((ClassPathXmlApplicationContext)context).close();
	}
}
