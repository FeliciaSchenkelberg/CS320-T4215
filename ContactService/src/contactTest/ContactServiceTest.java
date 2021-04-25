package contactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contactClass.ContactService;

public class ContactServiceTest {
	protected String contactID, longFirstName, longLastName, longPhone, longAddress;
	protected String firstName, lastName, Phone, Address;

	@BeforeEach
	void setUp() {
		contactID = "0000000002";
		
		longFirstName = "Feliciaaaaa";
		longLastName = "Schenkelberg";
		longPhone = "80000000000";
		longAddress = "123 Cherry Blossom Lane, Stony Point, NC 28678";
		
		firstName = "Felicia";
		lastName = "Schenkelbe";
		Phone = "8000000000";
		Address = "123 Cherry Lane";
	}

	@Test
	void contactServiceTest() {
		ContactService Contact = new ContactService(contactID, longFirstName, longLastName, longPhone, longAddress);
		assertAll("contactServiceTest",
					() -> assertNotNull(Contact.getContact().get(0).getContactID()),
					() -> assertNotNull(Contact.getContact().get(0).getfirstName()),
					() -> assertNotNull(Contact.getContact().get(0).getlastName()),
					() -> assertNotNull(Contact.getContact().get(0).getPhone()),
					() -> assertNotNull(Contact.getContact().get(0).getAddress()));
		}
	
	@Test
	void deleteContactTest() {
		ContactService Contact = new ContactService(contactID, longFirstName, longLastName, longPhone, longAddress);
		assertAll("deleteContactTest",
				() -> assertEquals(contactID, Contact.getContact().get(0).getContactID()),
				() -> assertNotNull(Contact.getContact().get(0).getfirstName()),
				() -> assertNotNull(Contact.getContact().get(0).getlastName()),
				() -> assertNotNull(Contact.getContact().get(0).getPhone()),
				() -> assertNotNull(Contact.getContact().get(0).getAddress()));
	}
	
	@Test
	void updatefirstNameTest() {
		ContactService Contact = new ContactService(contactID, longFirstName, longLastName, longPhone, longAddress);
		assertAll("deleteContactTest",
				() -> assertEquals(contactID, Contact.getContact().get(0).getContactID()),
				() -> assertEquals(firstName, Contact.getContact().get(0).getfirstName()),
				() -> assertNotNull(Contact.getContact().get(0).getlastName()),
				() -> assertNotNull(Contact.getContact().get(0).getPhone()),
				() -> assertNotNull(Contact.getContact().get(0).getAddress()));
	}
		
	@Test
	void updatelastNameTest() {
		ContactService Contact = new ContactService(contactID, longFirstName, longLastName, longPhone, longAddress);
		assertAll("deleteContactTest",
				() -> assertEquals(contactID, Contact.getContact().get(0).getContactID()),
				() -> assertEquals(firstName, Contact.getContact().get(0).getfirstName()),
				() -> assertEquals(lastName, Contact.getContact().get(0).getlastName()),
				() -> assertNotNull(Contact.getContact().get(0).getPhone()),
				() -> assertNotNull(Contact.getContact().get(0).getAddress()));
	}
	
	@Test
	void updatePhoneTest() {
		ContactService Contact = new ContactService(contactID, longFirstName, longLastName, longPhone, longAddress);
		assertAll("deleteContactTest",
				() -> assertEquals(contactID, Contact.getContact().get(0).getContactID()),
				() -> assertEquals(firstName, Contact.getContact().get(0).getfirstName()),
				() -> assertEquals(lastName, Contact.getContact().get(0).getlastName()),
				() -> assertEquals(Phone, Contact.getContact().get(0).getPhone()),
				() -> assertNotNull(Contact.getContact().get(0).getAddress()));
	}
	
	@Test
	void updateAddressTest() {
		ContactService Contact = new ContactService(contactID, longFirstName, longLastName, longPhone, longAddress);
		assertAll("deleteContactTest",
				() -> assertEquals(contactID, Contact.getContact().get(0).getContactID()),
				() -> assertEquals(firstName, Contact.getContact().get(0).getfirstName()),
				() -> assertEquals(lastName, Contact.getContact().get(0).getlastName()),
				() -> assertEquals(Phone, Contact.getContact().get(0).getPhone()),
				() -> assertEquals(Address, Contact.getContact().get(0).getAddress()));
	}
}