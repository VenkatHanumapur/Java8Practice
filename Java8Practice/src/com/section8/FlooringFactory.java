package com.section8;

import java.util.function.Supplier;

public class FlooringFactory {

	public static Flooring getFlooring(int minTemp, int maxTemp) {
		Supplier<Flooring> flooring;
		
		if(minTemp<=5 && maxTemp<=20) {
			flooring= () -> new WoodenFlooring();
			
		} else if(minTemp<=4 && maxTemp>=45) {
			flooring = () -> new CorkFlooring();
			
		} else {
			flooring = () -> new ConcereteFlooring();			
		}
		
		return flooring.get();
	}

}
