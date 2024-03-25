package com.nit.datajapa.serviceimp;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.datajapa.entity.Task;
import com.nit.datajapa.entity.Users;
import com.nit.datajapa.exception.APIException;
import com.nit.datajapa.exception.TaskNotFound;
import com.nit.datajapa.exception.UserNotFound;
import com.nit.datajapa.payload.TaskDto;
import com.nit.datajapa.repositary.TaskRepositary;
import com.nit.datajapa.repositary.UsersRpositary;
import com.nit.datajapa.service.TaskServices;

@Service
public class TaskServiceimp implements TaskServices{

	@Autowired
	private ModelMapper modelmapper;

	@Autowired
    private UsersRpositary userrepo;
	
	@Autowired
	private TaskRepositary taskrepo;
	
	@Override
	public TaskDto SaveTask(int userid, TaskDto taskdto) {
		
		Users user=userrepo.findById(userid).orElseThrow(
				()-> new UserNotFound(String.format("User %d Not Found", userid)));	
		Task task = modelmapper.map(taskdto, Task.class);
		task.setUser(user);
		Task tasksaved =taskrepo.save(task);
		
		return modelmapper.map(tasksaved, TaskDto.class);
	}


   
	@Override
	public List<TaskDto> getAllTasks(int userid) {
		
		userrepo.findById(userid).orElseThrow(
				()-> new UserNotFound(String.format("User %d Not Found", userid)));
		
		List<Task> tasks=taskrepo.findAllByUserId(userid);
		
		return tasks.stream().map
				( task -> modelmapper.map(task,TaskDto.class)).collect(Collectors.toList());
	}



	@Override
	public TaskDto getTask(int userid, int taskid) {
		
		Users user=userrepo.findById(userid).orElseThrow(
				()-> new UserNotFound(String.format("User %d Not Found", userid)));
		
		Task task=taskrepo.findById(taskid).orElseThrow(
				() -> new TaskNotFound(String.format("Task %d Not Found", taskid)));
		
		if(user.getId() != task.getUser().getId()) {
			throw new APIException(String.format("Task Id %d is not belongs to User Id %d", taskid,userid));
		}
		return modelmapper.map(task, TaskDto.class);
	}



	@Override
	@Transactional
	public void deleteTask(int userid, int taskid) {
		
		Users user=userrepo.findById(userid).orElseThrow(
				()-> new UserNotFound(String.format("User %d Not Found", userid)));
		
		Task task=taskrepo.findById(taskid).orElseThrow(
				() -> new TaskNotFound(String.format("Task %d Not Found", taskid)));
		
		if(user.getId() != task.getUser().getId()) {
			
			throw new APIException(String.format("Task Id %d is not belongs to User Id %d", taskid,userid));
		}
		
		taskrepo.delete(task);
	
		
	}

}
