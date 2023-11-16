package com.bootcamp.basicjavaclass1;

import com.bootcamp.basicjavaclass2.InstanceVariableDemo;

public class FirstDay {
	
	public static void main(String[] args) {
		
		// local variables 
		String lastName = "Pandey";
		int age = 10;
		System.out.println(age);
		System.out.println(lastName);
		
		lastName = "Apple";
		
		
		InstanceVariableDemo demo = new InstanceVariableDemo();
		System.out.println("LAst Name : "+demo.lastName); 
		
		demo.showDefaultValue();
		
		
		
		
	}
}
