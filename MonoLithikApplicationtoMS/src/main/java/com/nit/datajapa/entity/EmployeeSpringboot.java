package com.nit.datajapa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EmployeeSpringboot",uniqueConstraints = {
		@UniqueConstraint(columnNames = {"employeeemail"})
})
public class EmployeeSpringboot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String employeename;
	
	@Column(nullable = false)
	private String employeeemail;
	
	@Column(nullable = false)
	private long employeeAssigndprojects;
	
	@Column(name = "employeebaselocation",nullable = false)
	private String employeebaselocation;

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

	@Override
	public String toString() {
		return "EmployeeSpringboot [id=" + id + ", employeename=" + employeename + ", employeeemail=" + employeeemail
				+ ", employeeAssigndprojects=" + employeeAssigndprojects + ", employeebaselocation="
				+ employeebaselocation + "]";
	}


	
	
}
