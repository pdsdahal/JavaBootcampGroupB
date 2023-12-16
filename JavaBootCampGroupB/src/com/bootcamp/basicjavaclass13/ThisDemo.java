package com.bootcamp.basicjavaclass13;

public class ThisDemo {

	private int id;
	private String firstName;

	String lastName1;
	String address1;

	// way 1 : Use to refer current class instance variables 
	public void showStudent(int id, String firstName) {
		this.id = id;
		this.firstName = firstName;
	}

	public void setStudent(String lastName, String address) {
		lastName1 = lastName;
		address1 = address;

		// Way 2 : Use to call current class method
		this.showStudent(1234, "Ram");
	}

	public void showAllValues() {
		System.out.println("Id : " + id);
		System.out.println("FirstName : " + firstName);
		System.out.println("Last Name : " + lastName1);
		System.out.println("Address : " + address1);
	}

	public static void main(String[] args) {
		ThisDemo demo = new ThisDemo();
		demo.setStudent("Dahal", "St. louis");

		demo.showAllValues();
	}

}
