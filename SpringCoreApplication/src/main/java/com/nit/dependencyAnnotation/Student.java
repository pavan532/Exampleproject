package com.nit.dependencyAnnotation;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	@Autowired
	private Address addres;
	
	private String name;
	private int id;
	private BigDecimal PhoneNumber;
  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(BigDecimal phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public Address getAddres() {
		return addres;
	}
	public void setAddres(Address addres) {
		this.addres = addres;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", PhoneNumber=" + PhoneNumber + ", addres=" + addres + "]";
	}
	
	
}
