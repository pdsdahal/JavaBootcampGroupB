package com.bootcamp.basicjavaclass14;

public class EncapsulationDemoAccess {

	public static void main(String[] args) {

		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setAddress("St. Louis");

		String address = obj.getAddress();
		System.out.println("Address : " + address);

	}

}
