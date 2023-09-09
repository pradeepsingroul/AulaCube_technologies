package com.aulacude.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulacude.Entities.Task;
import com.aulacude.Exceptions.TaskExceptions;
import com.aulacude.Repository.TaskRepo;
import com.aulacude.Services.TaskServices;

@Service
public class TaskServiceImpl implements TaskServices{
	
	@Autowired
	private TaskRepo tRepo;
	
	
	
	@Override
	public List<Task> getActiveTaskService() throws TaskExceptions {
		List<Task> qList = tRepo.getPendingTask(); //finding the quizes
		return qList; //returning
	}
	
	@Override
	public List<Task> getCompletedTaskService() throws TaskExceptions {
		List<Task> qList = tRepo.getCompletedTask(); //finding the quizes
		return qList; //returning
	}

	@Override
	public Task createTask(Task task) throws TaskExceptions {
		Optional<Task> opt =  tRepo.findById(task.getId()); //finding the quize
		if(opt.isPresent()) { //checking it exist or not
			throw new TaskExceptions("task already exits with id : "+task.getId());
		}else {
			return tRepo.save(task); //returning
		}
	}

	@Override
	public List<Task> getAllTask() throws TaskExceptions {
		List<Task> tList = tRepo.findAll(); //finding the quizes
		return tList; //returning
	}

	@Override
	public Task getByID(Integer id) throws TaskExceptions {
		Optional<Task> opt =  tRepo.findById(id); //finding the quize
		if(opt.isPresent()) {  //checking it exist or not
			return opt.get(); //returning
		}else {
			throw new TaskExceptions("Task does not exits with id : "+id);
		}
	}

	@Override
	public Task deleteById(Integer id) throws TaskExceptions {
		Optional<Task> opt =  tRepo.findById(id); //finding the quize
		if(opt.isPresent()) {  //checking it exist or not
			Task tsk = opt.get();
			tRepo.delete(tsk);
			return tsk;
		}else {
			throw new TaskExceptions("Task does not exits with id : "+id);
		}
	}

	@Override
	public Task updateStatus(Integer id,String status) throws TaskExceptions {
		Optional<Task> opt =  tRepo.findById(id); //finding the quize
		if(opt.isPresent()) {  //checking it exist or not
			Task tsk = opt.get();
			tsk.setStatus(status);
			return tRepo.save(tsk);
		}else {
			throw new TaskExceptions("Task does not exits with id : "+id);
		}
	}

}
