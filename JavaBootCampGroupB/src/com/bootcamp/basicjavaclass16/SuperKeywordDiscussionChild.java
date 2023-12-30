package com.bootcamp.basicjavaclass16;

public class SuperKeywordDiscussionChild extends SuperKeywordDiscussionParent {
	
	public SuperKeywordDiscussionChild(String address) {
		super("Nahean",4568.89);
	}
	
	private int age;
	
	public void showEmpoyeeDetails() {
		
		System.out.println("Age " +super.age);
		System.out.println("Name : "+super.employeeName);
		System.out.println("Salary : "+super.salary);
		
		super.modifyAge();
		System.out.println("After modification Age " +super.age);
		
		
	}
	
	public static void main(String[] args) {
		
		SuperKeywordDiscussionChild childObj = new SuperKeywordDiscussionChild("Nepal");
		childObj.showEmpoyeeDetails();
	}

}
