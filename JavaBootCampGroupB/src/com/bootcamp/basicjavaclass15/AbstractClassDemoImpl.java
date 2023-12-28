package com.bootcamp.basicjavaclass15;

public class AbstractClassDemoImpl extends AbstractClassDemo {

	public void employeeName(String name, int age) {
	
		String employeeName = name + "\nAge : "+age;
		System.out.println("Employee Name : "+employeeName);
	
	}

	public int getSum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public String[] getStudentNames() {
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		AbstractClassDemoImpl obj = new AbstractClassDemoImpl();
		obj.employeeName("Lamyea", 11);
		
		int resultSum =  obj.getSum(10, 20);
		System.out.println("Sum is : "+resultSum);
	}

	public int getSum(double num1, double num2) {
		return 0;
	}

}
