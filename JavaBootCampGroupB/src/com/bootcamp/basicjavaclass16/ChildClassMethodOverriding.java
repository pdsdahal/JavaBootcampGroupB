package com.bootcamp.basicjavaclass16;

public class ChildClassMethodOverriding extends ParentClassMethodOverriding {

	
	public void setEmployeeDetails(String name, int age) {
		for(int i=0;i<age;i++) {
			System.out.println(name + " , "+i);
		}
	}
	
	public static void main(String[] args) {
		
		ChildClassMethodOverriding childObj = new ChildClassMethodOverriding();
		
		int age = childObj.getAge();
		System.out.println("Age : "+age);
		
		
		childObj.setEmployeeDetails("Ram Pandey", 5);
		
		
		ParentClassMethodOverriding parent = new ParentClassMethodOverriding();
		parent.setEmployeeDetails("Sita Dahal", 10);
		
		//upcasting
		ParentClassMethodOverriding parent1 = new ChildClassMethodOverriding();
		parent1.setEmployeeDetails("Jahed", 16);
		
	}
}
