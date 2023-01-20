package com.section2;

import java.util.stream.IntStream;

public class ImperativeVSDeclarative {

	public static void main(String[] args) {
		//Imperative (How to do)		
		int sumOfEven=0;		
		for (int i = 0; i <=100; i++) {			
			if(i%2==0) {
				sumOfEven=sumOfEven+i;
				}			
		}
		
		System.out.println(sumOfEven);
		
		//Declarative or Functional style (what to do)
		
		int sumOfEvens=IntStream.rangeClosed(0, 100)
				       .filter(i -> i%2==0)
				       .reduce((x,y) -> x+y) 
				       .getAsInt();
		
		System.out.println(sumOfEvens);
				       

	}

}
