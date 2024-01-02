package com.bootcamp.basicjavaclass17;

public class SingleInheritanceParent {
	
	protected int num1;//40
	protected int num2;//50
	
	public SingleInheritanceParent(int num1, int num2) {//40, 50
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getAdd() {
		int sum = num1 + num2;
		return sum;
	}
	
	public void showDiff(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(num1 + " - "+num2 + " = "+result);
	}

}
