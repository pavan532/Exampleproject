package com.nit.losecoupleAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
		
		StudnetMarkscoreFinout con=context.getBean("marks",StudnetMarkscoreFinout.class);
		
		MarksCards stu1= new Student1();//@Qualifier("stu1")
		Student3 stu=new Student3(); //@Primary
//		MarksCards stu2 = new Student2();
//		MarksCards stu3 = new Student3();
		
		con.setMarks(stu);
		con.show();
		
		context.close();

	}

}
