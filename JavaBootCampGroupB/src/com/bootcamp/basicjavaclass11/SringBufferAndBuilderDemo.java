package com.bootcamp.basicjavaclass11;

public class SringBufferAndBuilderDemo {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Ram Pandey");
		buffer.append(" Sita Khan").append(" Sabrina");
		System.out.println("Buffer : "+buffer.toString());
		
		
		StringBuilder builder = new StringBuilder("Ram Pandey");
		builder.append(" Sita Khan").append("Sabrina");
		
		String resultSubsTring = builder.substring(11, 15);
		System.out.println("Sub String Result : "+resultSubsTring);
		
		System.out.println("Builder : "+ builder.toString());
		
	}

}
