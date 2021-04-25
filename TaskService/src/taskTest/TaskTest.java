package taskTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import taskClass.Task;

public class TaskTest {
	protected String taskID, Name, Description;

	@BeforeEach
	void setUp() {
		taskID = "0000000001";
		Name = "The Task Object";
		Description = "The task object shall have a required description";
	}

	@Test
	void taskTest() {
		Task task = new Task(taskID, Name, Description);
		assertAll("taskTest",
				() -> assertNotNull(task.getTaskID()),
				() -> assertNotNull(task.getName()),
				() -> assertNotNull(task.getDescription()));
	}

	@Test
	void taskIDTest() {
		Task task = new Task(taskID, Name, Description);
		assertAll("taskIDTest",
				() -> assertEquals(taskID, task.getTaskID()),
				() -> assertNotNull(task.getName()),
				() -> assertNotNull(task.getDescription()));
	}

	@Test
	void NameTest() {
		Task task = new Task(taskID, Name, Description);
		assertAll("NameTest",
				() -> assertEquals(taskID, task.getTaskID()),
				() -> assertEquals(Name, task.getName()),
				() -> assertNotNull(task.getDescription()));
	}

	@Test
	void DescriptionTest() {
		Task task = new Task(taskID, Name, Description);
		assertAll("DescriptionTest",
				() -> assertEquals(taskID, task.getTaskID()),
				() -> assertEquals(Name, task.getName()),
				() -> assertEquals(Description, task.getDescription()));
	}
}