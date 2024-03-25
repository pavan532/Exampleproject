package com.nit.second;

public class Student {

	private int id;  
	private String name;
	
	public Student() {
		
	}
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	void show() {
		
		System.out.println("Name is :"+name);
		System.out.println("Number is :"+id);
	}
}
