package com.bootcamp.basicjavaclass9;

public class BreakKeywordDemo {
	
	public static void main(String[] args) {
		
		
		for(int i=0; i< 10; i++) {// outer loop : 10 times
			
			for(int j=0;j<5;j++) {// child or inner for loop: 5 times 
				System.out.println( i + " , "+j);
				if(i==4 && j==2) {
					break;
				}
				
			}
		}
		

		System.out.println("Outside the for loop");
	}

}

// 0 , 0
// 0, 1
// 0, 2
// 0, 3
// 0, 4
// 0, 4