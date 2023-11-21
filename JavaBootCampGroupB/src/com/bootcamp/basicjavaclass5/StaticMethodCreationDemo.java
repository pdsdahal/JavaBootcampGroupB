package com.bootcamp.basicjavaclass5;

public class StaticMethodCreationDemo {

	public static void printEmployeeDetails(int ageP, String firstNameP, String lastNameP, double salaryP) {
		System.out.println("Age : "+ageP);
		System.out.println("FirstName : "+firstNameP);
		System.out.println("LastName : "+lastNameP);
		System.out.println("Salary : "+salaryP);
	}
	
	static String setEmployeeName(String employeeName) {//Jahed Pandey
		employeeName = employeeName + " Abc"; //Jahed Pandey + " Abc"
		return employeeName;
	}
	
	public static void main(String[] args) {
		
		int age = 30;
		String firstName = "Ram";
		String lastName = "Pandey";
		double salary = 3456.57;
	
		StaticMethodCreationDemo.printEmployeeDetails(age, firstName, lastName, salary);
		
		String result =  StaticMethodCreationDemo.setEmployeeName("Jahed Pandey");
		System.out.println("Full Employee Name : "+result);
	}
}
