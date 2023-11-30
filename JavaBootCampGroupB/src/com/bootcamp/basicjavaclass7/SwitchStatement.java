package com.bootcamp.basicjavaclass7;

public class SwitchStatement {

	public static void main(String[] args) {

		String  day = "monday";

		switch (day) {

		case "monday":// 1==1
			System.out.println("Inside the case 1");
			break;
			
		case "friday"://2==1
			System.out.println("Inside the case 2");
			break;

		default:
			System.out.println("No case match");

		}
		
		System.out.println("Outside the switch block..");

	}

}
