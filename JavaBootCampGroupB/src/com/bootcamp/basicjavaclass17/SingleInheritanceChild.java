package com.bootcamp.basicjavaclass17;

public class SingleInheritanceChild extends SingleInheritanceParent {
	
	private String name;
	
	public SingleInheritanceChild(int num1, int num2, String name) {//100, 200
		super(num1, num2);
		this.name = name;
	}
	
	
	public void getMul() {
		int resultMul =  super.num1 * super.num2;
		System.out.println(super.num1 +" * "+super.num2 +" = "+resultMul);
		
		super.showDiff(50, 10);
	}
	
	

	public static void main(String[] args) {
		
		SingleInheritanceChild childObj = new SingleInheritanceChild(40,50 , "Ram");
		
		int resultAdd = childObj.getAdd();
		System.out.println("Result Add : "+resultAdd);
		
		childObj.getMul();
	}
	
}
