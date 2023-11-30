package com.bootcamp.basicjavaclass7;

import java.util.Scanner;

public class IFElseIfLadderStatement {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter a character");
		char input = scanner.nextLine().charAt(0);
		
		if(input == 'A') {
			System.out.println("Inside the if block");
		}else if(input=='B' || input == 'b') {
			System.out.println("Inside the first else if block");
			
		}else if(input=='C' || input=='c') {
			System.out.println("Inside the second else if block");
			
		}else {
			System.out.println("Inside the else block");
		}
		
		scanner.close();
		
	}

}
