package com.section7;

import java.util.function.Function;

public class Currying {

	public static void main(String[] args) {
		Function<Integer, Function<Integer,Integer>> fun1 = u -> {
		return	v -> u+v;
		};		
		Function<Integer,Integer> fun2 = fun1.apply(1);
		Integer sum1 = fun2.apply(2);		
		System.out.println(sum1);
		
		Integer sum2 = fun1.apply(2).apply(3);
		System.out.println(sum2);		
		
		
		Function<Integer, Function<Integer,Function<Integer,Integer>>> fun11= (u -> v -> w -> u+v+w);
		Function<Integer, Function<Integer,Integer>> fun22 =fun11.apply(1);
		Function<Integer,Integer> fun33 = fun22.apply(2);
		Integer sum11 = fun33.apply(3);
		System.out.println(sum11);
		

	}

}
