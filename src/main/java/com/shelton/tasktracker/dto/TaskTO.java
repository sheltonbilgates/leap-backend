package com.shelton.tasktracker.dto;



import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskTO {
	@Id
	private ObjectId id;
	private String title;
	private String description;
	private String duedate;
	private String completed;
}
