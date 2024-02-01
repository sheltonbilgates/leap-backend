package com.shelton.tasktracker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shelton.tasktracker.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String>{

}
