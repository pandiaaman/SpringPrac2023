package com.pandiaaman.springAutowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Emp {

	private int empId;
	private String empName;
	
	@Autowired
	@Qualifier("empAddress")
	private EmpAdd empAddress;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empId, String empName, EmpAdd empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public EmpAdd getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(EmpAdd empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
}
