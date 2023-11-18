package com.bootcamp.basicjavaclass4;

public class MethodCreationDemo {

	//parameters
	public int performAddition(int num1, int num2) {
		int add = num1 + num2;//12 + 14 = 26
		System.out.println(num1 +" + "+num2 + " = " +add );
		return add;
	}
	
	 void performDiv(double num1, double num2) {
		double div = num1 / num2;
		System.out.println(num1 +" / "+num2 + " = " +div);
	}
	
	 protected String returnEmployeeName() {
		 String employeeName = "Ram Pandey";
		 return employeeName;
	 }
	
	public static void main(String[] args) {
	
		MethodCreationDemo obj = new MethodCreationDemo();
		//arguments
		int result =  obj.performAddition(12,14);
		
		System.out.println("Result : "+result);
		
		obj.performDiv(13, 3);
		
		String employeeName = obj.returnEmployeeName();
		System.out.println("Employee NAme : "+employeeName);
	}
}
