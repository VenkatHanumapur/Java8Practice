package com.section5;

import java.util.function.Consumer;

public class ConsumerMethodReferncePractice {

	public static void main(String[] args) {
		Consumer<String> cons = e -> System.out.println(e);
		cons.accept("Test123");
		
		//Nethod reference (object::instancemethod)		
		Consumer<Integer> cons1 = System.out::println;
		cons1.accept(1234);
 
	}

}
