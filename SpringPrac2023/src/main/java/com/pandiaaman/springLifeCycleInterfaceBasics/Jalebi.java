package com.pandiaaman.springLifeCycleInterfaceBasics;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Jalebi implements InitializingBean, DisposableBean{

	private int jalebiID;
	private double jalebiPrice;
	private String jalebiCurrency;
	
	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jalebi(int jalebiID, double jalebiPrice, String jalebiCurrency) {
		super();
		this.jalebiID = jalebiID;
		this.jalebiPrice = jalebiPrice;
		this.jalebiCurrency = jalebiCurrency;
	}
	public int getJalebiID() {
		return jalebiID;
	}
	public void setJalebiID(int jalebiID) {
		this.jalebiID = jalebiID;
	}
	public double getJalebiPrice() {
		return jalebiPrice;
	}
	public void setJalebiPrice(double jalebiPrice) {
		this.jalebiPrice = jalebiPrice;
	}
	public String getJalebiCurrency() {
		return jalebiCurrency;
	}
	public void setJalebiCurrency(String jalebiCurrency) {
		this.jalebiCurrency = jalebiCurrency;
	}
	@Override
	public String toString() {
		return "Jalebi [jalebiID=" + jalebiID + ", jalebiPrice=" + jalebiPrice + ", jalebiCurrency=" + jalebiCurrency
				+ "]";
	}
	
	//destroy method
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method");
		
	}
	
	//init method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");
		
	}
	
	
}
