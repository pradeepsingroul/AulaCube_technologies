
package com.aulacude.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulacude.Entities.Task;
import com.aulacude.Services.TaskServices;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private TaskServices tService;
	
	//getting the active quizes
	@GetMapping("/active") 
	public ResponseEntity<List<Task>> getActiveTaskController(){
		List<Task> activeTasklList = tService.getActiveTaskService();
		return new ResponseEntity<>(activeTasklList,HttpStatus.OK);
	}
	
	//creating new task
	@PostMapping()
	public ResponseEntity<Task> createTask(@Valid @RequestBody Task task){
		Task tas = tService.createTask(task);
		return new ResponseEntity<Task>(tas,HttpStatus.OK);
	}
	@PutMapping("/{id}/{status}")
	public ResponseEntity<Task> updateTask(@PathVariable Integer id,@PathVariable String status){
		Task tas = tService.updateStatus(id,status);
		return new ResponseEntity<Task>(tas,HttpStatus.OK);
	}
	
	//getting all tasks 
	@GetMapping()
	public ResponseEntity<List<Task>> getAlltaskController(){
		List<Task> allTaskList = tService.getAllTask();
		return new ResponseEntity<>(allTaskList,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Task> getByID(@PathVariable Integer id){
		Task task = tService.getByID(id);
		return new ResponseEntity<>(task,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Task> deleteByID(@PathVariable Integer id){
		Task task = tService.deleteById(id);
		return new ResponseEntity<>(task,HttpStatus.OK);
	}
}
