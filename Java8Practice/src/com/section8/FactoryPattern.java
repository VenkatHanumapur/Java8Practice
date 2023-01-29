package com.section8;

public class FactoryPattern {

	public static void main(String[] args) {
		Flooring flooring = FlooringFactory.getFlooring(5, 15);
		flooring.installation();
		
		Flooring flooring2 = FlooringFactory.getFlooring(14, 45);
		flooring2.installation();

	}

}
