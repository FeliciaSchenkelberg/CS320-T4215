package appointmentTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import appointmentClass.AppointmentService;

public class AppointmentServiceTest {
	protected String appointmentID, longDescription;
	protected Date appointmentPastDate;

	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() {
		appointmentID = "0000000003";

		longDescription = "The appointment object shall have a required description String field that cannot be longer than 50 characters.";
		appointmentPastDate = new Date(2021, Calendar.JANUARY, 1);
	}

	@Test
	void appointmentServiceTest() {
		AppointmentService Appointment = new AppointmentService(appointmentID, appointmentPastDate, longDescription);
		assertAll("AppointmentServiceTest",
				() -> assertNotNull(Appointment.getAppointment().get(0).getAppointmentID()));
	}

	@Test
	void deleteAppointmentTest() {
		AppointmentService Appointment = new AppointmentService(appointmentID, appointmentPastDate, longDescription);
		assertAll("deleteAppointmentTest",
				() -> assertEquals(appointmentID, Appointment.getAppointment().get(0).getAppointmentID()));
	}
}