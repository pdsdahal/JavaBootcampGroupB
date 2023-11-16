package com.bootcamp.basicjavaclass2;

public class InstanceVariableDemo {
	
	// instance variables
	public String lastName = "Dahal";
	private int age;
	protected String firstName;
	double salary;
	
	//access modifiers
	public void showDefaultValue() {
		System.out.println("LastName Value : "+lastName);
		System.out.println("First Name Value : "+firstName);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
	
	public void changeDefaultValues() {
		lastName = "Sultana";
		age = 10;
		firstName = "Ram";
		salary = 456.56;
	}
	
	public static void main(String[] args) {
		//instance or object
		InstanceVariableDemo instancedemo = new InstanceVariableDemo();

		instancedemo.showDefaultValue();
		instancedemo.changeDefaultValues();
		instancedemo.showDefaultValue();
	}
}
