package com.bootcamp.basicjavaclass9;

public class ContinueDemo {
	
	public static void main(String[] args) {
		
		
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<5;j++) {
				if(i==4) {
					continue;
				}
				
				System.out.println(i + " , "+j);
			}
			
			
		
		}
		
	}

}
