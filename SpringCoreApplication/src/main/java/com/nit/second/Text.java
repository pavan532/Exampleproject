package com.nit.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("student.xml");
		Student stu=con.getBean("student",Student.class);
		stu.show();
		
		((ClassPathXmlApplicationContext) con).close();
	}

}
