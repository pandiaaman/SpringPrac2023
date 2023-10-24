package com.pandiaaman.springAutowireAnnotation;

public class EmpAdd {

	private String houseNo;
	private String street;
	private int pin;
	
	
	
	public EmpAdd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpAdd(String houseNo, String street, int pin) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.pin = pin;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
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
		return "EmpAdd [houseNo=" + houseNo + ", street=" + street + ", pin=" + pin + "]";
	}
	
	
}
