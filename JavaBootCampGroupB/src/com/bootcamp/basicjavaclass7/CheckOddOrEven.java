package com.bootcamp.basicjavaclass7;

public class CheckOddOrEven {

	public static void main(String[] args) {

		int num1 = 3;
		boolean result = (num1 % 2 == 0);

		if (result) {
			System.out.println("Input number is even : " + num1);
		} else {
			System.out.println("Input number is odd : " + num1);
		}

		// negative and positive check
		if (num1 < 0) {
			System.out.println("Numer is negative");
		} else if (num1 > 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("zero");
		}

	}

}
