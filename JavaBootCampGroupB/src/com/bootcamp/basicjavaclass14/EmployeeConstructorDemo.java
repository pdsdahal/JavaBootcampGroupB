package com.bootcamp.basicjavaclass14;

public class EmployeeConstructorDemo {

	String employeeName;
	int age;

	// no argument constructor
	public  EmployeeConstructorDemo(){
		System.out.println("Called.......");
		employeeName = "Ram Pandey";
		age = 10;
	}
	
	public void showData() {
		System.out.println("Name : "+employeeName);
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args) {
		
		EmployeeConstructorDemo obj = new EmployeeConstructorDemo();
		obj.showData();
	}

}
