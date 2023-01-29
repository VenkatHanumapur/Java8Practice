package com.section8;

public class IteratorPatternTest {

	public static void main(String[] args) {
		
		Integer[] intArray =new Integer[] {3,4,8,9,10};
		
		MyArrayList<Integer> myList = new MyArrayList<Integer>(intArray);
		myList.forEach(System.out::println);

	}

}
