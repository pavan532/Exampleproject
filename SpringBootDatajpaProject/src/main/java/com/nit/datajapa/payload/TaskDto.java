package com.nit.datajapa.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskDto {

	private int id;

	private String task;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "TaskDto [id=" + id + ", task=" + task + "]";
	}
	
}
