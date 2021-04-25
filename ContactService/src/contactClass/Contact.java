package contactClass;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String Phone;
	private String Address;

	int maxLength = 10;

	public Contact(String contactID, String firstName, String lastName, String Phone, String Address) {
		if (contactID.length() > maxLength && contactID != null) {
			this.contactID = contactID;
		}
	}

	public void setfirstName(String newfirstName) {
		if (firstName.length() > maxLength && firstName != null) {
			this.firstName = newfirstName;
		}
	}

	public void setlastName(String newlastName) {
		if (lastName.length() > maxLength && lastName != null) {
			this.lastName = newlastName;
		}
	}

	public void setPhone(String newPhone) {
		if (Phone.length() == maxLength && Phone != null) {
			this.Phone = newPhone;
		}
	}

	public void setAddress(String newAddress) {
		if (Address.length() > (maxLength * 3) && Address != null) {
			this.Address = newAddress;
		}
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