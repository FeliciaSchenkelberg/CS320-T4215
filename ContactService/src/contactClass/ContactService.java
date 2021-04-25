package contactClass;

import java.util.List;
import java.util.ArrayList;

public class ContactService {
	private String contactID;
	private String firstName;
	private String lastName;
	private String Phone;
	private String Address;

	int maxLength = 10;

	private List<Contact> c = new ArrayList<>();

	public ContactService(String contactID, String firstName, String lastName, String Phone, String Address) {
		if (contactID.length() > maxLength && contactID != null) {
			this.contactID = contactID;
		}
	}

	public void deleteContact(String contactID) {
		for (Contact list : c) {
			if (list.getContactID().equals(contactID)) {
				c.remove(list);
			}
		}
	}

	public void updatefirstName(String newfirstName) {
		if (firstName.length() > maxLength && firstName != null) {
			this.firstName = newfirstName;
		}
	}

	public void updatelastName(String newlastName) {
		if (lastName.length() > maxLength && lastName != null) {
			this.lastName = newlastName;
		}
	}

	public void updatePhone(String newPhone) {
		if (Phone.length() == maxLength && Phone != null) {
			this.Phone = newPhone;
		}
	}

	public void updateAddress(String newAddress) {
		if (Address.length() > (maxLength * 3) && Address != null) {
			this.Address = newAddress;
		}
	}

	public List<Contact> getContact() {
		return c;
	}

	public String getContactID() {
		return contactID;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public String getAddress() {
		return Address;
	}
}