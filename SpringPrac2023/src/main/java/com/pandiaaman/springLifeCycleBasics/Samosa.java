package com.pandiaaman.springLifeCycleBasics;

public class Samosa {

	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("initiating init : present inside the pojo");
	}
	
	public void destroy() {
		System.out.println("initiating destroy : present inside the pojo");
	}
	
}
