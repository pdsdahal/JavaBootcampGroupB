package com.bootcamp.basicjavaclass18;

import java.util.Arrays;

public class MultipleInheritace implements MathematicalOperationSetA, LoopingOperationSetB {

	public void fordemo(int size) {
		for(int i=0;i<size;i++) {
			System.out.println(i);
		}
	}

	public String[] reverseData(String[] datas) {
		
		String[] reverseResult = new String[datas.length];
		
		for(int i=0;i<datas.length;i++) {
			String data = datas[i];
			
			String reverseData =  new StringBuilder(data).reverse().toString();
			reverseResult[i] = reverseData;
		}
		return reverseResult;
	}

	public int sum(int num1, int num2) {
		return 0;
	}

	public void diff(int num1, int num2) {
		
	}

	public double div(double num1, double num2) {
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		MultipleInheritace demo = new MultipleInheritace();
		
		String[] datas = {"Taharat","Nahean","Jahed","Lamyea"};
		System.out.println("Input : "+Arrays.toString(datas));
		
		String[] resultReverse = demo.reverseData(datas);
		System.out.println("Output : "+Arrays.toString(resultReverse));
	}

}
