package com.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Order {
	// Normal approach

//	List<String> cart = new ArrayList<>();
//	String address="";

//	public void add(String item) {
//		System.out.println(item + " is added to the cart");
//		cart.add(item);
//	}
//	
//	public void deliveryAt(String address) {
//		System.out.println(" Deliver the order at "+address);
//		this.address=address;
//	}
//
//	public void place() {
//		System.out.println("Order is placed!");
//		System.out.println(this.cart.size()+" items ordered by you will be delivered at "+this.address+" by tomorrow");
//	}
	
	

	// Updated approach with function chaining
//	List<String> cart = new ArrayList<>();
//	String address = "";
//
//	public Order(List<String> cart, String address) {
//		this.cart = cart;
//		this.address = address;
//	}
//
//	public Order() {
//		
//	}
//
//	public Order add(String item) {
//		System.out.println(item + " is added to the cart");
//		cart.add(item);
//		return new Order(this.cart, this.address);
//	}
//
//	public Order deliveryAt(String address) {
//		System.out.println(" Deliver the order at " + address);
//		this.address = address;
//		return new Order(this.cart, this.address);
//	}
//
//	public void place() {
//		System.out.println("Order is placed!");
//		System.out.println(
//				this.cart.size() + " items ordered by you will be delivered at " + this.address + " by tomorrow");
//	}
	
	// Updated approach with function chaining and functional interface 
	
	List<String> cart = new ArrayList<>();
	String address = "";

	public Order(List<String> cart, String address) {
		this.cart = cart;
		this.address = address;
	}

	public Order() {
		
	}

	public Order add(String item) {
		System.out.println(item + " is added to the cart");
		cart.add(item);
		return new Order(this.cart, this.address);
	}

	public Order deliveryAt(String address) {
		System.out.println(" Deliver the order at " + address);
		this.address = address;
		return new Order(this.cart, this.address);
	}

	public static void place(Function<Order, Order> function) {
		Order order = new Order();
		function.apply(order);
		
		System.out.println("Order is placed!");
		System.out.println(
				order.cart.size() + " items ordered by you will be delivered at " + order.address + " by tomorrow");
	}

}
