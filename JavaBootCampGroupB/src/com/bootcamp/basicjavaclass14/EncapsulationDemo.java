package com.bootcamp.basicjavaclass14;

public class EncapsulationDemo {
	
	private int employeeId;
	private String employeeName;
	private String address;
	
	public int getEmployeeId() { 
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
