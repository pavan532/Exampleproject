package com.nit.dependencyAnnotation;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Configuration.class);
		
		Student stu=con.getBean("student",Student.class);
		
		stu.setId(532);
		stu.setName("pavan");
	
		 BigDecimal PhoneNumber= new BigDecimal("6300729962");
		 int num=PhoneNumber.intValue();
		 
		stu.setPhoneNumber(new BigDecimal(num));
		
		System.out.println("Studentid is :"+stu.getId());
		System.out.println("StudentName is :"+stu.getName());
		System.out.println("StudentPhoneNumber is :"+stu.getPhoneNumber());
		
		Address ad=new Address();
		ad.setState("Andhra Pradesh");
		ad.setVillege("Tenali");
		System.out.println("StudentState is :"+ad.getVillege());
		System.out.println("Student State is :"+ad.getState());
		
		stu.setAddres(ad);
		 System.out.println(java.time.LocalDate.now()+" : pavan");
		 
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date));
		    
			 SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");  
			    Date date1 = new Date();  
			    System.out.println(format.format(date1));
		    
		con.close();
		

	}

}
