package com.nit.losecoupleAnnotation;

import org.springframework.stereotype.Component;

@Component("stu3")
public class Student3 implements MarksCards {

	@Override
	public void MathScore() {
		
		System.out.println("MathScore is 0/100");
		System.out.println("Fail NextTime BetterLuck");

	}

	@Override
	public void scienceScore() {
		
		System.out.println("scienceScore is 0/100");
		System.out.println("Fail NextTime BetterLuck");

	}

}
