package com.nit.Annotationbase;

import org.springframework.stereotype.Component;

@Component
public class driver {
	
	private String drivername;
	private int drivernumber;
	private String drivervillege;
	
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public int getDrivernumber() {
		return drivernumber;
	}
	public void setDrivernumber(int drivernumber) {
		this.drivernumber = drivernumber;
	}
	public String getDrivervillege() {
		return drivervillege;
	}
	public void setDrivervillege(String drivervillege) {
		this.drivervillege = drivervillege;
	}
	@Override
	public String toString() {
		return " [drivername=" + drivername + ", drivernumber=" + drivernumber + ", drivervillege="
				+ drivervillege + "]";
	}
	
}
