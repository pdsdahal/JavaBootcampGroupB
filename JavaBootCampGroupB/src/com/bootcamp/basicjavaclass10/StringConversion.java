package com.bootcamp.basicjavaclass10;

public class StringConversion {
	
	public static void main(String[] args) {
		
		String ageString = "20";
		
		System.out.println("Original  : "+ageString);
		int ageInt =  Integer.parseInt(ageString);
		System.out.println("Final : "+ageInt);
		
		String salary = "234567.567";
		double doubleSalary = Double.parseDouble(salary);
		String backString = String.valueOf(doubleSalary);
		
		System.out.println("Final Double : "+doubleSalary);
		
		
		String lenght = "67 L";
		int len = Integer.parseInt(lenght);
		System.out.println("Length : "+len);
		
		
	}

}
