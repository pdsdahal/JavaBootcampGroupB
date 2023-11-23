package com.bootcamp.basicjavaclass6;

public class LogicalOperatorDemo {
	
	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 100;
		
		// &&
		boolean resultAnd = (num1 < num2) && (num1 < 21);// (20 < 100) && (20 <21) // true && true // true
		System.out.println("("+num1 + " < "+num2 + ") && ("+num1 +" < 21 ) = "+resultAnd);
	
		boolean resultAnd1 = (num2 < num1) && (num1 < 21);// (100 < 20) && (20 <21) // false && true = false 
		System.out.println("("+num2 + " < "+num1 + ") && ("+num1 +" < 21 ) = "+resultAnd1);
	
		// ||
		
		boolean resultOr = (num2 < num1) || (num1 < 21);// (100 < 20) || (20 <21) // false || true = true 
		System.out.println("("+num2 + " < "+num1 + ") || ("+num1 +" < 21 ) = "+resultOr);
	
		boolean resultOr1 = (num2 >= num1) || (num1 != 21);// (100 >= 20) || (20 != 21) // true ||  true
		System.out.println("("+num2 + " >= "+num1 + ") || ("+num1 +" != 21 ) = "+resultOr1);
	
		// && , ||, !=
		boolean resultOrAndComb = (num1 < num2) && (num1 < 21) && (num2 >= num1) || (num1 != 21);
		System.out.println("("+num1 +" < "+ num2 +") && ("+ num1 +"< 21+ ) && (" +num2 +" >= "+ num1 + ") || ( "+num1 +"!= 21) = " + resultOrAndComb);
		
		//(20 < 100) && (20 < 21) && (100 >= 21) || (20 != 21) // true && true && true || true // true && true || true // true || true
		
	
	}

}
