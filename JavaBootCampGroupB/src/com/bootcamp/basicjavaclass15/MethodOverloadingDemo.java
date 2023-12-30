package com.bootcamp.basicjavaclass15;

public class MethodOverloadingDemo {

	public int getSum(int num1, int num2) {
		return num1 + num2;
	}

	public int getSum(double num1, double num2) {

		return (int) (num1 + num2);
	}

	public int getSum(float num1, double num2) {

		int result = (int) (num1 + num2);

		return result;
	}

	public int getSum() {
		return 34;
	}

	public int getSum(int num1) {
		return num1;
	}

	public void getSum(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("sum : " + result);
	}

	public static void main(String[] args) {

		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.getSum(10.0, 20.0);
	}

}
