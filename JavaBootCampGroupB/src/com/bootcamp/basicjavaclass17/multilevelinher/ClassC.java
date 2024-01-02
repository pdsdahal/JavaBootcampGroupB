package com.bootcamp.basicjavaclass17.multilevelinher;

public class ClassC extends ClassB {

	private double salary;
	
	public ClassC(String employeeName, String employeeAddress, int age, double salary) {
		super(employeeName, employeeAddress, age);
		this.salary = salary;
	}
	
	public void showEmployeeInfo() {
		super.showAge();
		System.out.println("Salary : "+salary);
	}

	
	public static void main(String[] args) {
		
		ClassC childC = new ClassC("Ram Pandey", "Missouri", 10, 67.56);
		childC.showEmployeeInfo();
		
		
	}
}
