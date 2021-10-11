package com.practice.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {
	
	CustomerImpl customer = new CustomerImpl(); 

	@Override
	public int getId() {
		return customer.getId();
	}

	@Override
	public List<Order> getOrders() {
		
		ArrayList<Order> orderList = new ArrayList<Order>();
		Order order1 = new Order();
		order1.setId(101);
		order1.setProductName("Samsung Galaxy M30s");
		order1.setQuantity(30);
		orderList.add(order1);
		
		Order order2 = new Order();
		order2.setId(102);
		order2.setProductName("iPhone 12 Pro");
		order2.setQuantity(15);
		orderList.add(order2);
		
		return orderList;
	}

}
