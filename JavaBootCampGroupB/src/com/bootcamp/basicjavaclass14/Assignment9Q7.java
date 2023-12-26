package com.bootcamp.basicjavaclass14;

import java.util.Scanner;

public class Assignment9Q7 {
	
	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of iteration");
		int n = scanner.nextInt();//5
		
		int sum = 0;
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter a number");
			int num = scanner.nextInt();
			if(num < 0) {
				break;
			}
			sum = sum + num;
		}
		
		System.out.println("sum is  : "+sum);
		
		
		
	}

}
