package com.section7;

import java.util.function.Predicate;

public class FunctionalCompositionTest {

	public static void main(String[] args) {
		Predicate<String> startsWithA = (text) -> text.startsWith("A");
		Predicate<String> endsWithX = (text) -> text.endsWith("x");
		Predicate<String> constainsP = (text) -> text.contains("p");
		
		Predicate<String> startWithAAndEndsWithX = (text) -> startsWithA.test(text) && endsWithX.test(text);
		String input = "A hardworking person must relax";
		
		boolean value = startWithAAndEndsWithX.test(input);
		System.out.println(value);
		
		// Above example can be implemented in another way
		
		Predicate<String> composed = startsWithA.and(endsWithX).and(constainsP);
		boolean value1 = composed.test(input);
		System.out.println(value1);
		
		
		
		

	}

}
