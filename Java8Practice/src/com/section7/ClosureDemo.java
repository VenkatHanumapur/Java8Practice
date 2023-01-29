package com.section7;

public class ClosureDemo {
	public static void main(String[] args) {
		
	 int value=111;	
	// value variable should be final or effectively final
	 Task lambda = () -> {
		 System.out.println(value);
		System.out.println(" Task is completed"); 
	 };
	 // value is in the scope of the main method. When passed the functional
	 //interface it also passes the value to the printValue method
	 // This value retention is possible with Closure concept
	 printValue(lambda);
	}

	private static void printValue(Task lambda) {
		lambda.doTask();		
	}
}
