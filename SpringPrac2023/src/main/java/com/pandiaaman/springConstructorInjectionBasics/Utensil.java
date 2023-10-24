package com.pandiaaman.springConstructorInjectionBasics;

public class Utensil {

	private int utensilId;
	private String utensilName;
	private String utensilType;
	//NOTICE no getters and setters here
	
	public Utensil(int utensilId, String utensilName, String utensilType) {
		super();
		this.utensilId = utensilId;
		this.utensilName = utensilName;
		this.utensilType = utensilType;
	}
	public Utensil() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Utensil [utensilId=" + utensilId + ", utensilName=" + utensilName + ", utensilType=" + utensilType
				+ "]";
	}
	
	
}
