package com.nit.dependencyAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String villege;
	private String state;
	public String getVillege() {
		return villege;
	}
	public void setVillege(String villege) {
		this.villege = villege;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String toString() {
		return "villege is : "+villege+" state is: "+state+" ";
	}
}
