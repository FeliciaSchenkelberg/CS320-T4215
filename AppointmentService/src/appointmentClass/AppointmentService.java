package appointmentClass;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class AppointmentService {
	private String appointmentID;

	int maxLength = 10;

	private List<Appointment> a = new ArrayList<>();

	public AppointmentService(String appointmentID, Date appointmentDate, String Description) {
		if (appointmentID.length() > maxLength && appointmentID != null) {
			this.appointmentID = appointmentID;
		}
	}

	public void deleteAppointmentID(String appointmentID) {
		for (Appointment ID : a) {
			if (ID.getAppointmentID().equals(appointmentID)) {
				a.remove(ID);
			}
		}
	}

	public List<Appointment> getAppointment() {
		return a;
	}

	public String getAppointmentID() {
		return appointmentID;
	}
}