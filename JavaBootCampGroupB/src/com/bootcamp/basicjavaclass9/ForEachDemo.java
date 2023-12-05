package com.bootcamp.basicjavaclass9;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		int num1 = 1234;
		String collegeName = "Texas College";
		
		// integer array
		int[] nums = {1,56,78,89,340};
		
		//string array
		String[] collegeNames = {"ABC college", "Texas College","Xyz", "ball123"};
		
		char[] charsData = {'a','b','c'};
		
		//syntax for each
		for(String college : collegeNames) {// 0 to less than size 4
			
			if(college.equals("ABC college")) {
				System.out.println("ABc is equal.");
			}else {
				System.out.println("College NAme : "+college);
			}
			
		}
		
	}

}
