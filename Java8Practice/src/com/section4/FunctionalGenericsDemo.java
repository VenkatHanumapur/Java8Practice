package com.section4;

public class FunctionalGenericsDemo {

	public static void main(String[] args) {
		FunctionalGenerics<String, String> fun = s -> s.substring(5);
	   String s1=fun.execute("TestOneTwoThree");
	   System.out.println(s1);
	   
	   FunctionalGenerics<String, Integer> len = s -> s.length();
	   System.out.println(len.execute("TestOneTwoThree"));

	}

}
