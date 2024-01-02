package com.bootcamp.basicjavaclass17.multilevelinher;

public class ClassB extends ClassA {

	protected int age;
	
	public ClassB(String employeeName, String employeeAddress, int age) {
		super(employeeName, employeeAddress);
		this.age = age;
		
	}
	
	public void showAge() {
		
		super.employeeName = "Taharat";
		super.employeeAddress = "India";
		
		super.showEmployeePII();
		System.out.println("Age : "+age);
	}
}
