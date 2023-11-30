package com.bootcamp.basicjavaclass7;

import java.util.Scanner;

public class IfElseStatement {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a integer number");
		int num1 = scanner.nextInt();
		
		if(num1 == 20) {
			
			int result = num1 + 100;
			System.out.println("Result : "+result);
			
		}else {
			int result = num1 - 100;
			System.out.println("Result : "+result);
			
		}
		
		
		
		scanner.close();
	}

}
