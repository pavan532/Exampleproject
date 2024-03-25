package com.nit.losecoupleAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("marks")
public class StudnetMarkscoreFinout {

	@Autowired
	//@Qualifier("stu1")
	private MarksCards Marks;

	
	public void setMarks(MarksCards Marks) {
		this.Marks = Marks;
	}
	
	public void show() {
		
		Marks.MathScore();
		Marks.scienceScore();
	}
}
