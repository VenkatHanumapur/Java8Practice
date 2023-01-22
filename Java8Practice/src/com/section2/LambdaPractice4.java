package com.section2;

public class LambdaPractice4 {

	public static void main(String[] args) {
		LengthOfString ls = s -> {
			 int ln = s.length();
			 System.out.println(ln);
			 return ln;
		};
		
		ls.length("TestOneThree");

	}

}
