package com.section5;

import java.util.function.BiFunction;

public class StaticReferenceWithParameters {
	
	public static void main(String[] args) {
		BiFunction<String, String, String> biFun = (a,b) -> a+":"+b;
		System.out.println(biFun.apply("Test", "Script"));
		
		BiFunction<String, String, String> biFun1= A_Class::staticMethod;
		
		System.out.println(biFun1.apply("My", "Results"));
		
	}

}

class A_Class{
	public static String staticMethod(String a,String b)
	{
		return a+":"+b;
	}
}
