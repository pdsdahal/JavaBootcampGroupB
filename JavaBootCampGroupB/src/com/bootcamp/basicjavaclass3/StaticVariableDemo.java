package com.bootcamp.basicjavaclass3;

public class StaticVariableDemo {

	private static String collegeName;
	public static int collegeId;
	protected static int totalEmployee;
	static double avgSalary;

	public static void showDefaultValue() {
		System.out.println("Default Value");
		System.out.println("College Name : " + collegeName);
		System.out.println("college Id : " + collegeId);
		System.out.println("total Employee : " + totalEmployee);
		System.out.println("Avg. Salary : " + avgSalary);
	}

	public static void main(String[] args) {

		System.out.println("Default Value : " + StaticVariableDemo.collegeName);
		StaticVariableDemo.collegeName = "Abc International College";
		System.out.println("Modified Value : " + StaticVariableDemo.collegeName);

		StaticVariableDemo.showDefaultValue();
	}

}
