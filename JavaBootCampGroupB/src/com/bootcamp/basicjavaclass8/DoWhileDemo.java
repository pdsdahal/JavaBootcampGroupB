package com.bootcamp.basicjavaclass8;

public class DoWhileDemo {
	
	public static void showValue(int num) {
		
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			
			showValue(i);
			i = i+1; // i = i+1
		}while(i <= 1000);
		
		
	}

	//1 ,3 ,5,7
	// 1 to 1000
}
