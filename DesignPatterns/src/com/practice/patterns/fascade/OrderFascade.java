package com.practice.patterns.fascade;

public class OrderFascade {

	private OrderProcessor processor = new OrderProcessor();
	
	public void processOrder(String name, int quantity) {
			if (processor.checkStock(name)) {
			String orderId = processor.placeOder(name, quantity);
			processor.shipOrder(orderId);
		}
	}
}
