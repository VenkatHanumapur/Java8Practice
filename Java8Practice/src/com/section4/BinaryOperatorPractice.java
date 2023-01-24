package com.section4;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {

	public static void main(String[] args) {
		BinaryOperator<String> biOP = (a,b) -> a+"."+b;
		
		System.out.println(biOP.apply("TestScripts", "com"));

	}

}
