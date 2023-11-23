package com.bootcamp.basicjavaclass6;

import java.util.Scanner;

public class TakeInputFromUser {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer number");
		int num1 = scanner.nextInt();
		
		System.out.println("enter a double number : ");
		double num2 = scanner.nextDouble();
		
		System.out.println("enter a username : ");
		scanner.nextLine();
		String username = scanner.nextLine();
		
		System.out.println("eneter a boolean : ");
		boolean value = scanner.nextBoolean();
		

		System.out.println("entered number from the user is : "+num1);
		System.out.println("entered double from the user is : "+num2);
		System.out.println("entered String from the user is : "+username);
		System.out.println("entered boolean from the user is : "+value);
			
		
		scanner.close();
	}

}
