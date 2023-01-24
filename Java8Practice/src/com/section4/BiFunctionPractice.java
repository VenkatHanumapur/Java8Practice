package com.section4;

import java.util.function.BiFunction;

public class BiFunctionPractice {

	public static void main(String[] args) {
		BiFunction<String, String, String> biFun = (a,b) -> a+" "+b;
		System.out.println(biFun.apply("Test", "Script"));
		
		BiFunction<String,String,Integer> biLenFun = (a,b) -> (a+b).length();
		System.out.println(biLenFun.apply("Test", "Script"));

	}

}
