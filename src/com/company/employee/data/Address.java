package com.company.employee.data;

public class Address {
	public int doorNumber;
	public String street;
	public String state;
	public String city;
	public String country;
	public int pincode;
	public Address(int doorNumber, String street, String state, String city, String country, int pincode) {
		this.doorNumber = doorNumber;
		this.street = street;
		this.state = state;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
}
}
