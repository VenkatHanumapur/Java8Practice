package com.section4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOpPractice {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,20,30,40);
		UnaryOperator<Integer> uOP = i -> i*10;
		
		List<Integer> list1=mapper(list,uOP);
		System.out.println(list1);

	}

	private static <T> List<T> mapper(List<T> list, UnaryOperator<T> uOP) {
		List<T> list11= new ArrayList<>();
		for(T t : list) {
			T t1 = uOP.apply(t);
			list11.add(t1);
		}
		
		return list11;
	}

}
