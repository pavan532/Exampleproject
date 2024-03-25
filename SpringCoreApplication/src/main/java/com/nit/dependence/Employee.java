package com.nit.dependence;

public class Employee {

	private int id;  
	private String name;  
	private Address address;//Aggregation
	
	public Employee() {
		
	}
	
	public Employee(int id,String name,Address address) {
		
		 this.id = id;  
		    this.name = name;  
		    this.address = address; 
	}
	
	public void show() {
		System.out.println("Name is :"+name);
		System.out.println("id is :"+id);
		System.out.println("Address is :"+address.toString());
	}
	
}
