package com.nit.Annotation;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	private int number;
	private String name;
	private String villege;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillege() {
		return villege;
	}
	public void setVillege(String villege) {
		this.villege = villege;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", villege=" + villege + "]";
	}
	
	
}
