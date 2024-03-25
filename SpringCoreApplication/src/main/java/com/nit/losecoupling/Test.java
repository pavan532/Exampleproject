package com.nit.losecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("cheater.xml");
		
		FindoutCheater test=context.getBean("losecouple",FindoutCheater.class);
		test.display();
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
