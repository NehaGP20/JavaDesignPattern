package com.practice.patterns.fascade;

public class Tester {

	public static void main(String[] args) {
		OrderFascade fascade = new OrderFascade();
		fascade.processOrder("Samsung", 8);
	}

}
