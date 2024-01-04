package com.bootcamp.basicjavaclass18;

public class MathematicalOperationImplSetA implements MathematicalOperationSetA {
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public void diff(int num1, int num2) {
		int result;
		
		if(num1 > num2) {
			 result = num1 - num2;
				
		}else {
			 result = num2 - num1;
		}
		
		System.out.println(num1 +" - "+num2 + " = "+result);
		
	}

	public double div(double num1, double num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		
		MathematicalOperationImplSetA obj  = new MathematicalOperationImplSetA();
		obj.diff(10, 20);
		
		
	}

	
	
}
