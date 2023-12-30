package com.bootcamp.basicjavaclass16;

public class SuperKeywordDiscussionParent {
	
	protected String employeeName = "Ram Pandey";
	protected int age = 20;
	protected double salary = 5678.67;
	
	
	public SuperKeywordDiscussionParent(String employeeName, double salary) {
		System.out.println("Parent Class constructor....");
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public void modifyAge() {
		age = 10;
	}

}
