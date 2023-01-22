package com.section2;

public class LambdPractice2 {

	public static void main(String[] args) {
		MathOperation sum = (a,b) -> System.out.println(a+b);
		sum.add(29, 59);
		
		MathOperation multiply = (a,b) -> System.out.println(a*b);
		multiply.add(78, 90);

	}

}
