package com.bootcamp.basicjavaclass4;

public class AccessModifiersDemo {

	//default
	int rollNo;
	//public
	public String studentFullName;
	//private 
	private double income;
	//protected
	protected String surname;
	
	
	void showRollNo() {
		rollNo = 10;
		System.out.println("Roll No : "+rollNo);
	}
	
	private void showStudentFullName() {
		studentFullName = "Ram Pandey";
		System.out.println("Full Name : "+studentFullName);
	}
	
	public void showIncome() {
		income = 123456.67;
		System.out.println("Income : "+income);
	}
	

	protected void showSurname() {
		surname = "Pandey";
		System.out.println("Surname : "+surname);
	}
	
	
}
