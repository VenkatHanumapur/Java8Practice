package com.section6;

import java.util.Optional;

public class MoreOpertaions {

	public static void main(String[] args) {
		Optional<String> optionalVal = Optional.of("Value");
		Optional<String> optionalVal1 = Optional.of("Value");
		Optional<String> optionalVal2 = Optional.of("Value123");
		//ifPresent -- consumes the value and doesn't return anything
		optionalVal.ifPresent(System.out::println);
		optionalVal.ifPresent(val -> System.out.println("This is a "+ val));
		
		Optional.empty().ifPresent(val -> System.out.println(val));
		
		//ifPresentOrElse
		
		optionalVal.ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));

		Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));
	
	    //stream
		
		optionalVal.stream().forEach(System.out::println);
		Optional.empty().stream().forEach(System.out::println);
		
		//or
		
		optionalVal.or(() -> Optional.of("New Value")).ifPresent(System.out::println);
	    Optional.empty().or(() -> Optional.of("New Value")).ifPresent(System.out::println);
	    //Supplier value in the 'or' method  should be null. Other it throws null pointer exception
	    //Optional.empty().or(() -> null).ifPresent(System.out::println);
	
	    
	    //equals
	    //Both objects should be Optional
	    // Either both the objects are empty or if the values in
	    // optionals are equal to each other via equals method
	    
	    System.out.println(optionalVal.equals(Optional.of("Value")));
	    
	    //hashcode
	    
	   System.out.println(optionalVal.hashCode());
	   
	   System.out.println(Optional.empty().hashCode());
	   
	   System.out.println(optionalVal.hashCode()+ " : "+ optionalVal1.hashCode()+" :"+optionalVal2.hashCode());
	
	}

}
