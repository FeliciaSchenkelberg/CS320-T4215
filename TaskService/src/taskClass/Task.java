package taskClass;
public class Task {
	private String taskID;
	private String Name;
	private String Description;

	int maxLength = 10;

	public Task(String taskID, String Name, String Description) {
		if (taskID.length() > maxLength && taskID != null) {
			this.taskID = taskID;
		}
	}

	public void setName(String newName) {
		if (Name.length() > (maxLength * 2) && Name != null) {
			this.Name = newName;
		}
	}

	public void setDescription(String newDescription) {
		if (Description.length() > (maxLength * 5) && Description != null) {
			this.Description = newDescription;
		}
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