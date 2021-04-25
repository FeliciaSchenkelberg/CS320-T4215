package contactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contactClass.Contact;

public class ContactTest {
	protected String contactID, firstName, lastName, Phone, Address;
	
	@BeforeEach
	void setUp() {
		contactID = "0000000001";
		firstName = "Felicia";
		lastName = "Schenkelbe";
		Phone = "8000000000";
		Address = "123 Cherry Lane";
		}

	@Test
	void contactTest() {
		Contact contact = new Contact(contactID, firstName, lastName, Phone, Address);
		assertAll("contactTest",
				() -> assertNotNull(contact.getContactID()),
				() -> assertNotNull(contact.getfirstName()),
				() -> assertNotNull(contact.getlastName()),
				() -> assertNotNull(contact.getPhone()),
				() -> assertNotNull(contact.getAddress()));
	}

	@Test
	void contactIDTest() {
		Contact contact = new Contact(contactID, firstName, lastName, Phone, Address);
		assertAll("contactIDTest",
				() -> assertEquals(contactID, contact.getContactID()),
				() -> assertNotNull(contact.getfirstName()),
				() -> assertNotNull(contact.getlastName()),
				() -> assertNotNull(contact.getPhone()),
				() -> assertNotNull(contact.getAddress()));
	}

	@Test
	void firstNameTest() {
		Contact contact = new Contact(contactID, firstName, lastName, Phone, Address);
		assertAll("firstNameTest",
				() -> assertEquals(contactID, contact.getContactID()),
				() -> assertEquals(firstName, contact.getfirstName()),
				() -> assertNotNull(contact.getlastName()),
				() -> assertNotNull(contact.getPhone()),
				() -> assertNotNull(contact.getAddress()));
	}

	@Test
	void lastNameTest() {
		Contact contact = new Contact(contactID, firstName, lastName, Phone, Address);
		assertAll("lastNameTest",
				() -> assertEquals(contactID, contact.getContactID()),
				() -> assertEquals(firstName, contact.getfirstName()),
				() -> assertEquals(lastName, contact.getlastName()),
				() -> assertNotNull(contact.getPhone()),
				() -> assertNotNull(contact.getAddress()));
	}
	
	@Test
	void PhoneTest() {
		Contact contact = new Contact(contactID, firstName, lastName, Phone, Address);
		assertAll("PhoneTest",
				() -> assertEquals(contactID, contact.getContactID()),
				() -> assertEquals(firstName, contact.getfirstName()),
				() -> assertEquals(lastName, contact.getlastName()),
				() -> assertEquals(Phone, contact.getPhone()),
				() -> assertNotNull(contact.getAddress()));
	}

	@Test
	void AddressTest() {
		Contact contact = new Contact(contactID, firstName, lastName, Phone, Address);
		assertAll("AddressTest",
				() -> assertEquals(contactID, contact.getContactID()),
				() -> assertEquals(firstName, contact.getfirstName()),
				() -> assertEquals(lastName, contact.getlastName()),
				() -> assertEquals(Phone, contact.getPhone()),
				() -> assertEquals(Address, contact.getAddress()));
	}
}