package com.tarikul.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarikul.app.entities.Task;
import com.tarikul.app.entities.User;

public interface TaskRepository extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user);

}
