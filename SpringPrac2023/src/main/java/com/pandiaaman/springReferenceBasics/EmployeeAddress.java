package com.pandiaaman.springReferenceBasics;

public class EmployeeAddress {

	private int houseNumber;
	private String street;
	private int pin;
	
	
	public EmployeeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeAddress(int houseNumber, String street, int pin) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.pin = pin;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [houseNumber=" + houseNumber + ", street=" + street + ", pin=" + pin + "]";
	}
	
	
	
}
