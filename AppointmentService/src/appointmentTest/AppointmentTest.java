package appointmentTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import appointmentClass.Appointment;

class AppointmentTest {
	protected String appointmentID, Description;
	protected Date appointmentDate;

	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() {
		appointmentID = "0000000001";
		Description = "The appointment object shall have a required description";
		appointmentDate = new Date(2022, Calendar.JANUARY, 1);
	}

	@Test
	void appointmentTest() {
		Appointment appointment = new Appointment(appointmentID, appointmentDate, Description);
		assertAll("appointmentTest",
				() -> assertNotNull(appointment.getAppointmentID()),
				() -> assertNotNull(appointment.getDescription()),
				() -> assertNotNull(appointment.getAppointmentDate()));
	}

	@Test
	void appointmentIDTest() {
		Appointment appointment = new Appointment(appointmentID, appointmentDate, Description);
		assertAll("appointmentIDTest",
				() -> assertEquals(appointmentID, appointment.getAppointmentID()),
				() -> assertNotNull(appointment.getDescription()),
				() -> assertNotNull(appointment.getAppointmentDate()));
	}

	@Test
	void DescriptionTest() {
		Appointment appointment = new Appointment(appointmentID, appointmentDate, Description);
		assertAll("DescriptionTest",
				() -> assertEquals(appointmentID, appointment.getAppointmentID()),
				() -> assertEquals(Description, appointment.getDescription()),
				() -> assertNotNull(appointment.getAppointmentDate()));
	}

	@Test
	void appointmentDateTest() {
		Appointment appointment = new Appointment(appointmentID, appointmentDate, Description);
		assertAll("appointmentDateTest",
				() -> assertEquals(appointmentID, appointment.getAppointmentID()),
				() -> assertEquals(Description, appointment.getDescription()),
				() -> assertEquals(appointmentDate, appointment.getAppointmentDate()));
	}
}