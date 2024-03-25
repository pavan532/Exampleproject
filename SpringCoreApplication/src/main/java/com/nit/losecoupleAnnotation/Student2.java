package com.nit.losecoupleAnnotation;

import org.springframework.stereotype.Component;

@Component("stu2")
public class Student2 implements MarksCards{

	@Override
	public void MathScore() {
		
		System.out.println("MathScore is 35/100");
		System.out.println("Ok Not Bad");
		
	}

	@Override
	public void scienceScore() {
		
		System.out.println("scienceScore is 85/100");
		System.out.println("GreateScore");
		
	}

}
