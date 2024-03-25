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
@Table(name = "ProjectSpringboot",uniqueConstraints = {
		@UniqueConstraint(columnNames = {"projectcode"})
})
public class ProjectSpringboot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private long projectcode;
	
	@Column(nullable = false)
	private String projectName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		return "ProjectSpringboot [id=" + id + ", projectcode=" + projectcode + ", projectName=" + projectName + "]";
	}
	

}