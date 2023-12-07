package com.bootcamp.basicjavaclass10;

public class StringComparision {
	
	public static void main(String[] args) {
		
	
		//way 1 : equals
		String firstName1 = "RAm";
		String firstName2 = "Ram";
		boolean result1 =  firstName1.equals(firstName2);
		System.out.println(firstName1 +" equal "+firstName2 + " : "+result1);
		
		//equalsIgnoreCase
		String lastName1 = "KHAn";
		String lastName2 = "khan";
		boolean result2  = lastName1.equalsIgnoreCase(lastName2);
		System.out.println(lastName1 +" equal "+lastName2 + " : "+result2);
		
		
	}

}
