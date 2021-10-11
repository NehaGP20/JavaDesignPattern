package com.practice.patterns.fascade;

public class OrderProcessor {
	
	public boolean checkStock(String name) {
		System.out.println("Checking stock");
		return true;
	}
	
	public String placeOder(String name, int quantity) {
		System.out.println("Order placed");
		return "abc123";
	}
	
	public void shipOrder(String orderId) {
		System.out.println("Order Shipped");
	}

}
