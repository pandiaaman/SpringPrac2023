package com.pandiaaman.springConstructorInjectionBasics;

public class Addition {

	private int a;
	private int b;
	
	public Addition(int a, int b) {
		System.out.println("constructor called : int int");
		this.a = a;
		this.b = b;
	}
	
	public Addition(double a, double b) {
		System.out.println("constructor called : double double");
		this.a = (int) a;
		this.b = (int) b;
	}
	
	public Addition(String a, String b) {
		System.out.println("constructor called : string string : default");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	public int sum() {
		return this.a + this.b;
	}
	
}
