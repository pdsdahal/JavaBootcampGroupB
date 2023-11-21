package com.bootcamp.basicjavaclass5;

public class AssignmentOperatorDemo {
	
	public static void main(String[] args) {
		
		//simple assignment operator = 
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Simple Assignent Operator (=)");
		System.out.println("Num1 : "+num1);
		System.out.println("Num2 : "+num2);
		
		// += (add and assignment operator)
		
		 num1 += num2; // num1 = num1 + num2// num1 = 10+20= 30
		 System.out.println("Num1 ( += ) : "+num1);
		 
		 //num1 = 30
		 //num2 = 20

		 // -= (subtract and assignment operator)
		 num2 -= num1; // num2 = num2 - num1 = 20 - 30 = -10
		 System.out.println("Num2 ( -= ) "+ num2);
		 
		 //num1 = 30
		 //num2 = -10
		 
		 // *= 
		 
		 num2 *= num2;// num2 = num2 * num2 = -10 * -10 = 100
		 System.out.println("Num2  ( *= ) : "+num2);
		 
		 //num1 = 30
		 //num2 = 100
		 
		 num1 /= num2;// num1 = num1/num2// 30/100 = 0
		 System.out.println("Num1 (/=) : "+num1);
	}

}
