package com.nit.HashMap;

import java.util.HashMap;

public class Student {

	public static void main(String[] args) {
		
		HashMap<HashCode, String> map=new HashMap<HashCode, String>();
		
		map.put(new HashCode("pavan"), "India");
		
		HashCode code=new HashCode("King");
		
		map.put(code, "AP");
		
		code.setName("Telgana");
		
		System.out.println(map.get(code));
		System.out.println(code.getName());
		System.out.println(code.hashCode());
		System.out.println(map.hashCode());
	

	
	}

	
}
