package com.section8;

public class FluentShopping {

	public static void main(String[] args) {
		// Normal approach testing
//		Order order = new Order();
//		order.add("Shoes");
//		order.add("Headphones");
//		order.deliveryAt("124 Test Street1, Bangalore");
//		order.place();
		
		// Updated approach with function chaining testing
		
//		Order order = new Order();
//		order.add("Shoes")
//		     .add("Headphones")
//		     .deliveryAt("124 Test Street1, Bangalore")
//		     .place();
		
		// Updated approach with function chaining and functional interface testing
		Order.place(order -> order.add("Shoes").add("Headphones").deliveryAt("124 Test Street1, Bangalore"));
	}

}
