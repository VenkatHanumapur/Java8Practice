package com.section5;

import java.util.function.Supplier;

public class SupplierMethodReferncePractice {

	public static void main(String[] args) {
		Supplier<Double> sup = () -> Math.random();
		System.out.println(sup.get());
		
		//Method Reference (Class::staticMethod)
		Supplier<Double> sup1 = Math::random;
		System.out.println(sup1.get());
 
	}

}
