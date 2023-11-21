package com.bootcamp.basicjavaclass5;

public class ArithmeticOperatorsDemo {
	
	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 5;
		
		double add =  (num1 + num2);
		double sub =  (num1 - num2);
		double div = (num1 / num2);
		double mod =  (num1 % num2);
		double mul =  (num1 * num2);
		
		System.out.println(num1 + " + "+num2 +" = "+add);//17
		System.out.println(num1 + " - "+num2 +" = "+sub);//7
		System.out.println(num1 + " / "+num2 +" = "+div);//2
		System.out.println(num1 + " * "+num2 +" = "+mul);//60
		System.out.println(num1 + " % "+num2 +" = "+mod);//2
		
		//
		
		int a  = 2;
		int b = 4;
		
		int result1 = (b * (a/b + a/b)); //4 //0 //			 2/4 = 0 
		int result2 = (b*a/b + b*a/b); //4  //4 //
		
		System.out.println("Result 1 : "+result1);
		System.out.println("Result 2 : "+result2);
		
	}

}
