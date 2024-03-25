package com.nit.HashMap;

public class FakeStudent extends Student1 {

	private String fakestudent;
	
	public FakeStudent(String name) {
		super(name);
		this.fakestudent=name;
	}
	
	public String getFakestudent() {
		return fakestudent;
	}
	public void setFakestudent(String fakestudent) {
		this.fakestudent = fakestudent;
	}
	
	

}
