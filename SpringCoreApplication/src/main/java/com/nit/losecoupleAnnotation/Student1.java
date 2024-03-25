package com.nit.losecoupleAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("stu1")
@Primary
public class Student1 implements MarksCards {

	@Override
	public void MathScore() {
		
		System.out.println("MathScore is 75/100");
		System.out.println("GreateScore");
		
	}

	@Override
	public void scienceScore() {
		
		//System.out.println("Name is not dispaly beacuase every one mocking this gay.");
		System.out.println("scienceScore is 35/100");
		System.out.println("Ok Not Bad");
		
	}

}
