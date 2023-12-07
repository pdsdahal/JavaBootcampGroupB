package com.bootcamp.basicjavaclass10;

public class ReturnDemo {
	
	public String getStudentDetails(String name, int rollNo) {
		String message = "Name : "+name + "\nRollNo : "+rollNo;
		return message;
	}
	
	public int getStudentId() {
		return 1234;
	}
	
	public int[] getCollegeNames(String[] CollNames) {
		
		int[] length = new int[CollNames.length];// 0,1, 2
		
		for(int i=0;i<CollNames.length;i++) {
			
			String collegeName = CollNames[i];
			int len = collegeName.length();
			length[i] = len;
		}
		
		
		return length;
	}

	
	public static void main(String[] args) {
		
		String name = "Ram Pandey";
		int rollNo = 10;
		
		ReturnDemo demo = new ReturnDemo();
		String result = demo.getStudentDetails(name, rollNo);
		
		System.out.println("Student Info\n"+result);
		
		int sudentId = demo.getStudentId();
		System.out.println("StudentId : "+sudentId);
		
		String[] CollNames = {"ABC", "Webster", "Texas"};
		int[] collegeNames = demo.getCollegeNames(CollNames);
		
		for(int i=0; i<collegeNames.length; i++) {
			int size  = collegeNames[i];
			String collgeName = CollNames[i];
			
			System.out.println("College Name : "+collgeName + " Size : "+size + " , "+i);
			
			}	
	}
}
