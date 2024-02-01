package com.shelton.tasktracker.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document(value = "task")
@Data
@Builder
public class Task {
	@Id
	private String id;
	private String title;
	private String description;
	private String duedate;
	private String completed;
	
}
