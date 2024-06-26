package com.nit.datajapa.payload;

public class EmployeeDto {
	
	private long id;
	private String employeename;
	private String employeeemail;
	private long employeeAssigndprojects;
	private String employeebaselocation;
    private long projectcode;
	private String projectName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeemail() {
		return employeeemail;
	}
	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}
	public long getEmployeeAssigndprojects() {
		return employeeAssigndprojects;
	}
	public void setEmployeeAssigndprojects(long employeeAssigndprojects) {
		this.employeeAssigndprojects = employeeAssigndprojects;
	}
	public String getEmployeebaselocation() {
		return employeebaselocation;
	}
	public void setEmployeebaselocation(String employeebaselocation) {
		this.employeebaselocation = employeebaselocation;
	}
	public long getProjectcode() {
		return projectcode;
	}
	public void setProjectcode(long projectcode) {
		this.projectcode = projectcode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", employeename=" + employeename + ", employeeemail=" + employeeemail
				+ ", employeeAssigndprojects=" + employeeAssigndprojects + ", employeebaselocation="
				+ employeebaselocation + ", projectcode=" + projectcode + ", projectName=" + projectName + "]";
	}
	
	

}
