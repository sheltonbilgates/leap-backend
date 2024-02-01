package com.shelton.tasktracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shelton.tasktracker.dto.TaskTO;
import com.shelton.tasktracker.model.Task;
import com.shelton.tasktracker.repository.TaskRepository;

@Service
public class TaskService {
	@Autowired
	private TaskRepository taskRepository;
	
	public String createTask(TaskTO taskTO) {
		try {
			Task task = Task.builder()
							.title(taskTO.getTitle())
							.description(taskTO.getDescription())
							.duedate(taskTO.getDuedate())
							.completed(taskTO.getCompleted())
							.build();
							
							
			taskRepository.save(task);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "Task Created Succesfully";
	}
public List<Task> getTasks(){
	List<Task> taskList = new ArrayList<>();
		try {
			taskList = taskRepository.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return taskList;
	}
public String deleteTasks(String id) {
	try {
		taskRepository.deleteById(id);
	} catch (Exception e) {
		// TODO: handle exception
	}
	return "Task Deleted Sucessfully";
}
public String updateTask(TaskTO task) {
	try {
		Task tasks = Task.builder()
						.id(task.getId())
						.description(task.getDescription())
						.duedate(task.getDuedate())
						.completed(task.getCompleted())
						.build();
		taskRepository.save(tasks);
	} catch (Exception e) {
		// TODO: handle exception
	}
	return "Task Updated Sucessfully";
}

}
