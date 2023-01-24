package com.section4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {

	public static void main(String[] args) {
		
		Function<String,Integer> fun1 = e -> e.length();
		
		List<String> list = List.of("Test122","Get14421","Jet44sss2");
		
		List<Integer> list1=map(list,fun1);
		System.out.println(list1);
 
	}

	private static <T,R> List<R> map(List<T> list, Function<T, R> fun1) {
		List<R> newList = new ArrayList<>();
		for(T t : list) {
			newList.add(fun1.apply(t));
		}
		
		return newList;
	}

}
