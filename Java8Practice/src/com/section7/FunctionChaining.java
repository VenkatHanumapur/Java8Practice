package com.section7;

import java.util.function.Function;

public class FunctionChaining {
	public static void main(String[] args) {
		Consumer<String> c1= s -> System.out.println(s);
		Consumer<String> c2= s->System.out.println(s);
		
		c1.accept("Test11");
		c2.accept("Test11");
		
		Consumer<String> c3 = (s) -> {
			c1.accept(s);
			c2.accept(s);
		};
		
		c3.accept("Test999");
		
		Consumer<String> c4 = c1.thenAccept(c2);
		c4.accept("Test555");
		
		//This will throw an error. To fix this error add condition if default method
		//Consumer<String> c5 = c1.thenAccept(null);
		
		Function<Integer, Integer> f1 = s -> s+5;
		Function<Integer,Integer> f2 = s -> s*10;
		
		Function<Integer,Integer> f3 = f1.andThen(f2);
	    Integer value = f3.apply(20);
	    System.out.println(value);
 
	}

}
