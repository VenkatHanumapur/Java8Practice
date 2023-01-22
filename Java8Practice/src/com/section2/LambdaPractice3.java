package com.section2;

public class LambdaPractice3 {

	public static void main(String[] args) {
		LengthOfString ls = (s) -> s.length();
		int len = ls.length("TestOneTwo");
		System.out.println(len);

	}

}
