package com.tarikul.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarikul.app.entities.Task;
import com.tarikul.app.entities.User;
import com.tarikul.app.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public void addTask(Task task , User user) {
		task.setUser(user);
		taskRepository.save(task);
	}
	
	public List<Task> findUserTask(User user){
		return taskRepository.findByUser(user);
		
	}
}
