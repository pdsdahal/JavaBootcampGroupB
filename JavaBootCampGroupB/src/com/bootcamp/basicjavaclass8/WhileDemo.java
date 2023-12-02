package com.bootcamp.basicjavaclass8;

public class WhileDemo {
	
	public static void showEmployeeName(String name, int age) {
		System.out.println("Name : "+name + " Age : "+age);
	}
	
	public static void main(String[] args) {
		
		int i = 10;
		int num = 20;
		
		while(i > -10 || num < 10 && 10 != 40) {
			
			showEmployeeName("Ram"+i, i);
			
			i--;
		}
		
		
	}

}
