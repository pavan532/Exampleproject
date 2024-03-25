package com.nit.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(configuration.class);
		Student stu=con.getBean("student",Student.class);
		
		stu.setName("PavanKumar");
		stu.setNumber(532);
		stu.setVillege("Tenali");
		
        System.out.println("Name is :"+stu.getName());
        System.out.println("Number is :"+stu.getNumber());
        System.out.println("Villege is :"+stu.getVillege());
        
        con.close();
	}

}
