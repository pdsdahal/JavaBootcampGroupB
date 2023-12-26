package com.bootcamp.basicjavaclass14;

public class StudentConstructorDemo {
	
	private String studentName;
	private int age;
	private String gender;
	private EmployeeConstructorDemo employeeDemo;
	
	
	public StudentConstructorDemo() {
		System.out.println("No Argument constructor");
	}
	
	//parametrized constructor
	public StudentConstructorDemo(EmployeeConstructorDemo employeeDemo, String studentName, int age, String gender) {

		this();
		
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
		this.employeeDemo = employeeDemo;
		
	}
	
	public void showStudentDetails() {
		System.out.println("Name : "+studentName);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		
		System.out.println("Employee Method invoked....");
		employeeDemo.showData();
	}
	
	public static void main(String[] args) {
		
		EmployeeConstructorDemo employee = new EmployeeConstructorDemo();
		
		StudentConstructorDemo obj = new StudentConstructorDemo(employee,"Ram Pandey", 11, "Male");
		
		
		obj.showStudentDetails();
	}

}
