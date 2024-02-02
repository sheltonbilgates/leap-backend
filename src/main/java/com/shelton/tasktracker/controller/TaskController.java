package com.shelton.tasktracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.shelton.tasktracker.dto.TaskTO;
import com.shelton.tasktracker.model.Task;
import com.shelton.tasktracker.service.TaskService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/task")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	
	public String createTask(@RequestBody TaskTO task) {
		return taskService.createTask(task);
		
	}
	@GetMapping("/get/task")
	@ResponseStatus(HttpStatus.OK)
	public List<Task> getTasks(){
		return taskService.getTasks();
	}
	@GetMapping("/delete/task")
	@ResponseStatus(HttpStatus.OK)
	public String deleteTasks(@RequestParam String id){
		return taskService.deleteTasks(id);
	}
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.CREATED)
	
	public String updateTask(@RequestBody TaskTO task) {
		return taskService.updateTask(task);
		
	}


}
  