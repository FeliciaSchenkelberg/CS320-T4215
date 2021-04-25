package taskClass;

import java.util.List;
import java.util.ArrayList;

public class TaskService {
	private String taskID;
	private String Name;
	private String Description;

	int maxLength = 10;

	private List<Task> t = new ArrayList<>();

	public TaskService(String taskID, String Name, String Description) {
		if (taskID.length() > maxLength && taskID != null) {
			this.taskID = taskID;
		}
	}

	public void deleteTask(String taskID) {
		for (Task list : t) {
			if (list.getTaskID().equals(taskID)) {
				t.remove(list);
			}
		}
	}

	public void updateName(String newName) {
		if (Name.length() > (maxLength * 2) && Name != null) {
			this.Name = newName;
		}
	}

	public void updateDescription(String newDescription) {
		if (Description.length() > (maxLength * 5) && Description != null) {
			this.Description = newDescription;
		}
	}

	public List<Task> getTask() {
		return t;
	}

	public String getTaskID() {
		return taskID;
	}

	public String getName() {
		return Name;
	}

	public String getDescription() {
		return Description;
	}
}