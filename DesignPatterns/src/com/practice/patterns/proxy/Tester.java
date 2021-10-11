package com.practice.patterns.proxy;

public class Tester {

	public static void main(String[] args) {

		Customer customer = new CustomerProxyImpl();
		System.out.println(customer.getId());
		System.out.println(customer.getOrders().size());
	}

}
