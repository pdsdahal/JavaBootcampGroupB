package com.bootcamp.basicjavaclass6;

public class RelationalOperatorDemo {
	
	public static void main(String[] args) {
		
		//simple equal operator
		int num1 = 20;
		int num2 = 20;
		boolean resultEql = (num1 == num2);// 20 == 20
		System.out.println(num1 + " == " + num2 + " = "+resultEql);
		
		// < less than
		int num3 = 51;
		int num4 = 50;
		
		boolean resultLessthEql = num3 <= num4; // 51 <= 50
		System.out.println(num3 + " <= " + num4 + " = "+resultLessthEql);
		
		//> 
		int num5 = 51;
		int num6 = 51;
		boolean resultGrethEq = num5 >= num6; // 51 >= 51
		System.out.println(num5 + " >= "+num6 + " = "+resultGrethEq);
		
		//!=
		
		int num7 = 100;
		int num8 = 100;
		
		boolean notEqual = num7 != num8;// 100 != 100 
		System.out.println(num7 + " != "+num8 + " = "+notEqual);
	}

}
