package com.bootcamp.basicjavaclass4;

public class CallAccessModifiersVariablesAndMethods {

	public static void main(String[] args) {
		
		AccessModifiersDemo source = new AccessModifiersDemo();
		
		//default
		System.out.println(source.rollNo);
		source.showRollNo();
		
		//public
		System.out.println(source.studentFullName);
		source.showIncome();
		
		//protected
		System.out.println(source.surname);
		source.showSurname();
		
//		//private
//		System.out.println(source.income);
//		source.showStudentFullName();
//		
		
		
	}
}
