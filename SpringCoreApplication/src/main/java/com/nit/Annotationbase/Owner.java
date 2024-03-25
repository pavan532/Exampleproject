package com.nit.Annotationbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("per")
public class Owner {

	@Autowired
	private driver driverman;
	
	private String ownername;
	private int ownernumber;
	private String ownervillege;
	
	

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public int getOwnernumber() {
		return ownernumber;
	}

	public void setOwnernumber(int ownernumber) {
		this.ownernumber = ownernumber;
	}

	public String getOwnervillege() {
		return ownervillege;
	}

	public void setOwnervillege(String ownervillege) {
		this.ownervillege = ownervillege;
	}

	public driver getDriverman() {
		return driverman;
	}

	public void setDriverman(driver driverman) {
		this.driverman = driverman;
	}

	@Override
	public String toString() {
		return "Owner [ownername=" + ownername + ", ownernumber=" + ownernumber + ", ownervillege=" + ownervillege
				+ ", driverman=" + driverman + "]";
	}
	

	
}
