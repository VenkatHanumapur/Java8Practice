package com.section4;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(53,33,88,24,57);
		
		Consumer<Integer> consumer = e -> System.out.println(e);
		consumer.accept(23);
		
		printElement(list1,consumer);
 
	}

	private static <T> void printElement(List<T> list1, Consumer<T> consumer) {
		for(T t : list1) {
			consumer.accept(t);
		}
		
	}

}
