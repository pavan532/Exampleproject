package com.nit.datajapa.service;

import java.util.List;

import com.nit.datajapa.payload.TaskDto;

public interface TaskServices {

	public TaskDto SaveTask(int userid,TaskDto taskdto);
	public List<TaskDto> getAllTasks(int userid);
	public TaskDto getTask(int userid,int taskid);
	public void deleteTask(int userid,int taskid);
	
	
}
