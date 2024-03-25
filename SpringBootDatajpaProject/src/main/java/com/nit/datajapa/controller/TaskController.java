package com.nit.datajapa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.datajapa.payload.TaskDto;
import com.nit.datajapa.service.TaskServices;

@RestController
@RequestMapping("/api")
public class TaskController {

	@Autowired
	private TaskServices service;
	
	@PostMapping("/{userid}/tasks")
	public ResponseEntity<TaskDto> SaveTask(
			@PathVariable(name = "userid") int userid,@RequestBody TaskDto task
			){
		return new ResponseEntity<TaskDto>(service.SaveTask(userid, task),HttpStatus.CREATED);
			
	}
	
	@GetMapping("/{userid}/tasks")
	public ResponseEntity<List<TaskDto>> gettAllTasks(
			@PathVariable(name = "userid") int userid){
		
		return new ResponseEntity<>(service.getAllTasks(userid),HttpStatus.OK);
	}
	
	@GetMapping("/{userid}/tasks/{taskid}")
	public ResponseEntity<TaskDto> getTask(
			@PathVariable(name = "userid") int userid,
			@PathVariable(name = "taskid") int taskid
			){
		
		return new ResponseEntity<>(service.getTask(userid, taskid),HttpStatus.OK);
		
		//http://localhost:8080/api/532/tasks/4 parent id and chaild id based to retrive 
	}
	
	@DeleteMapping(path="/{userid}/task/{taskid}")
	public ResponseEntity<String> deleteTask(
			@PathVariable(name = "userid") int userid,
			@PathVariable(name = "taskid") int taskid
			){
		service.deleteTask(userid, taskid);
		return new ResponseEntity<>("Task delete sussesfully !!",HttpStatus.OK);
		// http://localhost:8080/api/202/task/1
	}
	
}