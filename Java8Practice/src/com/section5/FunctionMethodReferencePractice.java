package com.section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionMethodReferencePractice {

	public static void main(String[] args) {
		List<String> list=List.of("Kit","Kat","Chacolate");
		Function<String,Integer> fun1= e -> e.length();
		
		List<Integer> list1=mapper(list, fun1);
		System.out.println(list1);
		
		//Method reference (class::instanceMethodName)
		
		Function<String,Integer> fun2 = String::length;
		List<Integer> list2=mapper(list,fun2);
		System.out.println(list2);

	}

	private static <T,R> List<R> mapper(List<T> list, Function<T, R> fun1) {
		List<R> numList= new ArrayList<>();
		for(T e : list)	{
			numList.add(fun1.apply(e));
		}
		return numList;
	}

}
