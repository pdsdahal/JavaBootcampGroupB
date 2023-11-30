package com.bootcamp.basicjavaclass7;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		if (true) {
			System.out.println("1");
			if (false) {
				System.out.println("2");
			} else {
				System.out.println("3");

				if (false) {
					System.out.println("4");
				} else if (true) {
					System.out.println("5");
				} else {
					System.out.println("6");
				}
			}			
			System.out.println("8");
		} else {
			System.out.println("9");
		}

		
		if(false) {
			
		}else if(false) {
			
		}else if(false) {
			
		}else {
			
		}
		
	}
}
