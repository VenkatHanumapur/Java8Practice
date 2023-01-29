package com.section7;

public class ReferentialTransparancy {

	public static void main(String[] args) {
		int result=0;
		result=add(2,multiply(2, 4));
		System.out.println(result);
		
		result=add(2,8);	
		System.out.println(result);
		
		result=add(2,multiply(2, multiply(2, 2)));	
		System.out.println(result);
		//all the above statements returns the same result		

	}
	
	public static int multiply(int a, int b) {
		// If we add this statement, then this multiply method is not referentially transparent 
		//System.out.println("Multiplying "+a+" "+b);
		return a*b;		
	}
	
	public static int add(int a,int b) {
		return a+b;
	}

}
