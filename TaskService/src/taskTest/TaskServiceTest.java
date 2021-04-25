package taskTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import taskClass.TaskService;

public class TaskServiceTest {
	protected String taskID, longName, longDescription;
	protected String Name, Description;

	@BeforeEach
	void setUp() {
		taskID = "0000000002";

		longName = "The task object shall have a required name String field that cannot be longer than 20 characters.";
		longDescription = "The task object shall have a required description String field that cannot be longer than 50 characters.";

		Name = "The task object";
		Description = "The task object shall have a required description";
	}

	@Test
	void taskServiceTest() {
		TaskService Task = new TaskService(taskID, longName, longDescription);
		assertAll("taskServiceTest",
				() -> assertNotNull(Task.getTask().get(0).getTaskID()),
				() -> assertNotNull(Task.getTask().get(0).getName()),
				() -> assertNotNull(Task.getTask().get(0).getDescription()));
	}

	@Test
	void deleteTaskTest() {
		TaskService Task = new TaskService(taskID, longName, longDescription);
		assertAll("deleteTaskTest",
				() -> assertEquals(taskID, Task.getTask().get(0).getTaskID()),
				() -> assertNotNull(Task.getTask().get(0).getName()),
				() -> assertNotNull(Task.getTask().get(0).getDescription()));
	}

	@Test
	void updateNameTest() {
		TaskService Task = new TaskService(taskID, longName, longDescription);
		assertAll("updateNameTest",
				() -> assertEquals(taskID, Task.getTask().get(0).getTaskID()),
				() -> assertEquals(Name, Task.getTask().get(0).getName()),
				() -> assertNotNull(Task.getTask().get(0).getDescription()));
	}

	@Test
	void updateDescriptionTest() {
		TaskService Task = new TaskService(taskID, longName, longDescription);
		assertAll("updateDescriptionTest",
				() -> assertEquals(taskID, Task.getTask().get(0).getTaskID()),
				() -> assertEquals(Name, Task.getTask().get(0).getName()),
				() -> assertEquals(Description, Task.getTask().get(0).getDescription()));
	}
}