package com.nit.HashMap;

import java.util.Objects;

public class HashCode {

	 private String name;

	public HashCode(String name) {
		super();
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public String tostring() {
//		
//		return "Name : "+name;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCode other = (HashCode) obj;
		return Objects.equals(name, other.name);
	}

}
