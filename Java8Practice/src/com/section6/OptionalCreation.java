package com.section6;

import java.util.Optional;

public class OptionalCreation {

	public static void main(String[] args) {
		String val="Test String";
		Optional<String> optional = Optional.of(val);
		System.out.println(optional.get());
		
		Optional<Integer> emptyOptionl1 = Optional.empty();
		//System.out.println(emptyOptionl1.get());
		
		Optional<String> nullable = Optional.of(null);
		System.out.println(nullable.get());

	}

}
