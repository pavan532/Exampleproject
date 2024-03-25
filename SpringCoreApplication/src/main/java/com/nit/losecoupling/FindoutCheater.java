package com.nit.losecoupling;

public class FindoutCheater {
	
	private ExamPaper exam;

	public void setExam(ExamPaper exam) {
		this.exam = exam;
	}
	
	public void display() {
		
		exam.MathPaper();
		exam.Physicspaper();
		exam.socialpaper();
		exam.hindipaper();
	}
	

}
