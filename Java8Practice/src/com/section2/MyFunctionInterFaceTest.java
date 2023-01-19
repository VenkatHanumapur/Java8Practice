package com.section2;

public class MyFunctionInterFaceTest {

	public static void main(String[] args) {
		
		MyFunctionalInterface myFunInt = () -> System.out.println("My Functional interface test");
		myFunInt.myMethod();
		
		myMethodTest(() ->  System.out.println("My Second Functional interface test"));
		

	}

	public static void myMethodTest(MyFunctionalInterface fun)
	{
		 fun.myMethod();
	}
}
