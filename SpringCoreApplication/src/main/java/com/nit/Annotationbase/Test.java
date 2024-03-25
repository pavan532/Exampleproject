package com.nit.Annotationbase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test{

	public static void main(String[] args) {
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Configuration.class);
		
		
		Owner ow=con.getBean("per",Owner.class);
		
		ow.setOwnername("Pavankumar");
		ow.setOwnernumber(532);
		ow.setOwnervillege("Tenali");
		
		System.out.println("ownername is :"+ow.getOwnername());
		System.out.println("ownernumber is :"+ow.getOwnernumber());
		System.out.println("ownervillege is :"+ow.getOwnervillege());
		
		driver dr=new driver();
		
		dr.setDrivername("jahn");
		dr.setDrivernumber(555);
		dr.setDrivervillege("UK");
		
		System.out.println("driverName is :"+dr.getDrivername());
		System.out.println("drivernumber is :"+dr.getDrivernumber());
		System.out.println("driverVillege is :"+dr.getDrivervillege());
		
		ow.setDriverman(dr);
		con.close();

	}

}
