package appointmentClass;

import java.util.Date;

public class Appointment {
	private String appointmentID;
	private Date appointmentDate;
	private String Description;

	int maxLength = 10;

	public Appointment(String appointmentID, Date appointmentDate, String Description) {
		if (appointmentID.length() > maxLength && appointmentID != null) {
			this.appointmentID = appointmentID;
		}
	}

	public void setAppointmentDate(Date newAppointmentDate) {
		if (appointmentDate.before(newAppointmentDate) && appointmentDate != null) {
			this.appointmentDate = newAppointmentDate;
		}
	}

	public void setDescription(String newDescription) {
		if (Description.length() > (maxLength * 5) && Description != null) {
			this.Description = newDescription;
		}
	}

	public String getAppointmentID() {
		return appointmentID;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public String getDescription() {
		return Description;
	}
}