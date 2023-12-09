package com.bootcamp.basicjavaclass11;

public class StringComparisonUsingCompareTo {
	
	public static void main(String[] args) {
		
		
		String collegeName1 = "Webster";//5
		String colleeName2 = "WeBster";//7
		
		int result = collegeName1.compareTo(colleeName2);
		System.out.println(collegeName1 + " compareTo "+colleeName2 + " : "+result);
		
		//lenght of s1 > length of s2 = positive value 
	}

}
