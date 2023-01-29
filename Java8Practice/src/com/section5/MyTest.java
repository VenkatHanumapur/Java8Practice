package com.section5;

public class MyTest {
	
   private String value;
	
	public MyTest(String value) {
		this.value=value;
		
	}
	
	public void testValue() {
		System.out.println("In MyTest testValue Method :"+value);
	}
	
	public static String getTestValue() {
		return "MyTestValue";
	}
	
	public String testValue11(String st1) {
	//	return this;
		System.out.println("In MyTest testValue Method :"+st1);
		return "In MyTest testValue Method TTTT :"+st1;
	}

}
