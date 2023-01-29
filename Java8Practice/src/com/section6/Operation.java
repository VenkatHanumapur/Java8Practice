package com.section6;

import java.util.Optional;
import java.util.function.Function;

public class Operation {
	
	public static void main(String[] args) {
		
		Optional<String>  optional = Optional.of("Value");
		
		// If value is present it maps/transform value into another value. 
		// In this context, it transform into another Option
		//map()
		Optional<String> mapVal = optional.map(val -> "Replaced");
		System.out.println(mapVal.get());
		
		Optional<String> emptyOptional = Optional.empty();
		String orElse = emptyOptional.map(val -> "Replaced").orElse("Empty");
		System.out.println(orElse);
			
		// This filters the value based on the condition in the filter
		//filter()
		Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("value"));
		System.out.println(filter.get());
		
	    String orElse2 = emptyOptional.filter(val -> val.equalsIgnoreCase("value")).orElse("Empty");
		System.out.println(orElse2);
		
		//flatMap is map function whose return value is already a Optional
		// This method is similar to map, but the mapping
	    // function is one whose result is already an {@code Optional}, and if
	    // invoked, {@code flatMap} does not wrap it within an additional
		// {@code Optional}.
	    //flatMap()
		
		Optional<String> flatMap1 = optional.flatMap(val -> Optional.of("Replaced"));
		System.out.println(flatMap1.get());
		Optional<Integer> flatMap2 = optional.flatMap(val -> Optional.of(152));
		System.out.println(flatMap2.get());
		Optional<String> flatMap3 = emptyOptional.flatMap(val -> Optional.of("Replaced"));
		System.out.println(flatMap3);
		
	}

}
