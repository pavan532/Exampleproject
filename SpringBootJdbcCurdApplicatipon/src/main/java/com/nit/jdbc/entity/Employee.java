package com.nit.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_SPRINGBOOT")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@Column
	private String BASELOCATION;
	
	@Column
	private long EMPLOYEE_ASSIGNDPROJECTS;
	@Column
	private String EMPLOYEEEMAIL;
	@Column
	private String EMPLOYEENAME;
	@Column
	private String EMPLOYEEBASELOCATION;
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getBASELOCATION() {
		return BASELOCATION;
	}
	public void setBASELOCATION(String bASELOCATION) {
		BASELOCATION = bASELOCATION;
	}
	public long getEMPLOYEE_ASSIGNDPROJECTS() {
		return EMPLOYEE_ASSIGNDPROJECTS;
	}
	public void setEMPLOYEE_ASSIGNDPROJECTS(long eMPLOYEE_ASSIGNDPROJECTS) {
		EMPLOYEE_ASSIGNDPROJECTS = eMPLOYEE_ASSIGNDPROJECTS;
	}
	public String getEMPLOYEEEMAIL() {
		return EMPLOYEEEMAIL;
	}
	public void setEMPLOYEEEMAIL(String eMPLOYEEEMAIL) {
		EMPLOYEEEMAIL = eMPLOYEEEMAIL;
	}
	public String getEMPLOYEENAME() {
		return EMPLOYEENAME;
	}
	public void setEMPLOYEENAME(String eMPLOYEENAME) {
		EMPLOYEENAME = eMPLOYEENAME;
	}
	public String getEMPLOYEEBASELOCATION() {
		return EMPLOYEEBASELOCATION;
	}
	public void setEMPLOYEEBASELOCATION(String eMPLOYEEBASELOCATION) {
		EMPLOYEEBASELOCATION = eMPLOYEEBASELOCATION;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", BASELOCATION=" + BASELOCATION + ", EMPLOYEE_ASSIGNDPROJECTS="
				+ EMPLOYEE_ASSIGNDPROJECTS + ", EMPLOYEEEMAIL=" + EMPLOYEEEMAIL + ", EMPLOYEENAME=" + EMPLOYEENAME
				+ ", EMPLOYEEBASELOCATION=" + EMPLOYEEBASELOCATION + "]";
	}
	
	
	
	
}
