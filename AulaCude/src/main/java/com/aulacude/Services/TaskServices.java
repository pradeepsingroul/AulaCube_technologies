package com.aulacude.Services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.aulacude.Entities.Task;
import com.aulacude.Exceptions.TaskExceptions;

public interface TaskServices {
	
	    //active Task
		List<Task> getActiveTaskService() throws TaskExceptions;

		//new Task
		Task createTask(Task quize) throws TaskExceptions;
		
		//get all Task
		List<Task> getAllTask() throws TaskExceptions;
		
		//get Task by id
		Task getByID(Integer id) throws TaskExceptions;
		
		//delete task by id
		Task deleteById(Integer id)throws TaskExceptions;
		
		//update task by id
		Task updateStatus(Integer id,String status)throws TaskExceptions;

}
