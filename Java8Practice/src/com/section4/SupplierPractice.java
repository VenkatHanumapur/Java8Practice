package com.section4;

import java.util.function.Supplier;

public class SupplierPractice {

	public static void main(String[] args) {
		Supplier<String> st1 = () -> "Test One";
		System.out.println(st1.get());
		
		Supplier<Double> randomNumber = () -> Math.random();
		System.out.println(randomNumber.get());

	}

}
