package com.section7;

public class FunctionalComposition {
	public static void main(String[] args) {
		Function<Square,Integer> fun1 = s -> s.getArea();
		//Function<Integer,Integer> fun3 = s -> s*200;
		Function<Integer,Double> fun2 = area -> Math.sqrt(area);
		Function<Square, Double> compose = fun2.compose(fun1);
		//Function<Square, Double> compose = fun2.compose(fun3).compose(fun1);
		Square square = new Square();
		square.setArea(100);
		Double side = compose.apply(square);
		System.out.println(side);
	}
}
