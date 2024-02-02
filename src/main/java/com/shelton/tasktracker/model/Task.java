package com.shelton.tasktracker.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "task")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Task {
	@Id
	private String id;
	private String title;
	private String description;
	private String duedate;
	private String completed;
	
}
