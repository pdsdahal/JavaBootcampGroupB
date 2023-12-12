package com.bootcamp.basicjavaclass12;

public class StringMethodsDemo {
	
	public static void main(String[] args) {
		
		//charAt
		String employeeName = "Ram Pandey";
		char indexAtNine = employeeName.charAt(9);
		System.out.println("charAt : "+ indexAtNine);
		
		//compareTo
		String name1 = "Ram";
		String name2 = "RaM";
		int resultCompare = name1.compareTo(name2);
		System.out.println("compareTo : "+resultCompare);
		
		//compareToIgnoreCase
		int resultCompareIgnore = name1.compareToIgnoreCase(name2);
		System.out.println("compareToIgnoreCase : "+resultCompareIgnore);
		
		//concat
		String collegeName = "Texas";
		String resultConact = collegeName.concat(" International College");
		System.out.println("concat : "+resultConact);
		
		//contains
		String address = "Kathmandu";
		boolean resultContains = address.contains("a");
		System.out.println("contains : "+resultContains);
		
		//toLowerCase
		String lowerCaseResult =  address.toLowerCase();
		System.out.println("toLowerCase : "+lowerCaseResult);
		
		//toUpperCase
		String upperCaseResult =  address.toUpperCase();
		System.out.println("toUpperCase : "+upperCaseResult);
		
		
		//contentEquals
		String departmentName = "Computer Science";
		boolean resultContentEqual = departmentName.contentEquals("Computer Science");
		System.out.println("contentEquals : "+resultContentEqual);
		System.out.println("Result contains "+departmentName.contains("Cop"));
		
		//endsWith
		System.out.println("endsWith : " +departmentName.endsWith("e"));
		
		//replace
		String companyName = "Google organization";
		System.out.println("replace : "+companyName.replace('o', 'N'));// GNNgle
		
		//lastIndexOf
		System.out.println("indexOf : "+companyName.lastIndexOf("o"));
		
		//isEmpty
		String course = " ";
		System.out.println("isEmpty : "+course.isEmpty());
		
		String app = "App IoT";
		System.out.println("Length : "+app.length());
		
		String project = "QAAutomation";
		System.out.println("substring : "+project.substring(2));
		
		//substring
		System.out.println("substring start, end : "+project.substring(2, 6));
		
		//replaceFirst
		String laptop = "Dell";
		System.out.println("replaceFirst : "+laptop.replaceFirst("l", "M"));
		
		//split
		String description = "This is demo class.";
		String[] descriptions = description.split(" ");
		
		for(int i=0;i<descriptions.length;i++) {
			System.out.println(i + " , "+descriptions[i]);
		}
		
		//toCharArray
		char[] resultChars = description.toCharArray();
		for(int i=0;i<resultChars.length;i++) {
			System.out.println(i + " , "+resultChars[i]);
		}
		
	}

}
