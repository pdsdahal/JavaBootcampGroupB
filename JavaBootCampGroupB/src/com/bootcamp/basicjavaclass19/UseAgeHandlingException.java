package com.bootcamp.basicjavaclass19;

public class UseAgeHandlingException {

	public void customExceptionDemo() throws AgeHandlingException, NullPointerException {
		
		int age = 10;
		if (age <= 10) {
			throw new AgeHandlingException("You are not eligible to vote. Your age is under 10");
		}else {
			System.out.println("You are allows to vote.");
		}
	}

	public static void main(String[] args) {

		UseAgeHandlingException obj = new UseAgeHandlingException();
		
		try {
			obj.customExceptionDemo();
		} catch (Exception e) {
			System.out.println("Inside the catch block : "+e.getMessage());
		}
	}

}
