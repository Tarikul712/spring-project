package com.tarikul.app;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tarikul.app.entities.Task;
import com.tarikul.app.entities.User;
import com.tarikul.app.service.TaskService;
import com.tarikul.app.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringProjectApplicationTests {

	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;

	@Before
	public void initDb() {
		{
			User newUser = new User("user@bjit.com", "user", "12345");
			userService.createUser(newUser);
		}
		{
			User newUser = new User("admin@bjit.com", "admin", "12345");
			userService.createUser(newUser);
		}

		Task userTask = new Task("6-2-18", "12:00", "1:00", "you need work today");
		User user = userService.findOne("user@bjit.com");
        taskService.addTask(userTask, user);
	}

	@Test
	public void testUser() {
		User user = userService.findOne("user@bjit.com");
	    assertNotNull(user);
	    User admin = userService.findOne("admin@bjit.com");
	    assertEquals(admin.getEmail(),"admin@bjit.com");
	}
	
	@Test
	public void testTask() {
		User user = userService.findOne("user@bjit.com");
		List<Task> task = taskService.findUserTask(user);
		assertNotNull(task);
	}
}
