package com.bootcamp.basicjavaclass19;

public class ExceptionalDiscussion {
	
	public static void main(String[] args) {
		
		
		String name = "Ram";
	
		int[] rollNos = {1,5,7,8};
		
		try {
			int length = name.length();
			System.out.println("Lenght : "+length );
			
			int indexAt10 = rollNos[10];
			
			System.out.println("At Index 10 : "+indexAt10);
			
		}
		
		catch(NullPointerException  e) {
			
			System.out.println("Inside the catch block : "+e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Inside the catch block : "+e1.getMessage());
		}
		
		finally{
			System.out.println("Inside the finally block");
		}
		
		System.out.println("End Statement");
		
	}

}
