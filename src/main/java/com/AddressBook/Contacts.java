package com.AddressBook;

public class Contacts {
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private int zip;
	private String city;
	private String state;
	private String address;

	public Contacts(String firstName, String lastName, String email, long phoneNumber, int zip, String city,
			String state, String address) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.address = address;
	}

	public Contacts() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contacts{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email
				+ '\'' + ", phoneNumber=" + phoneNumber + ", zip=" + zip + ", city='" + city + '\'' + ", state='"
				+ state + '\'' + ", address='" + address + '\'' + '}';
	}
}