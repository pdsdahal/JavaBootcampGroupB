package com.bootcamp.basicjavaclass17.multilevelinher;

public class ClassA {

	protected String employeeName;
	protected String employeeAddress;
	
	public ClassA(String employeeName, String employeeAddress) {
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}
	
	public void showEmployeePII() {
		System.out.println("employee Name : "+employeeName);
		System.out.println("Address : "+employeeAddress);
	}
	
}
