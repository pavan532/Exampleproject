package com.nit.boot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "STUDENTTABLE")
public class Examplestudent {

	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@SequenceGenerator(name = "Id_genarator",
//	sequenceName="student_gen",
//	allocationSize = 1)
	@Id
	@Column(name = "ROLLNUMBER")
	private int Rollnumber;
	
	@Column(name = "NICKNAME")
	private String NickName;
	
	@Column(name = "STATE")
	private String state;

	public int getRollnumber() {
		return Rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		Rollnumber = rollnumber;
	}

	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Examplestudent [Rollnumber=" + Rollnumber + ", NickName=" + NickName + ", state=" + state + "]";
	}
	
	
}
