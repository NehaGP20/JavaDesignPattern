package com.practice.patterns.decorator;

public class PizzaShop {

	public static void main(String[] args) {
		Pizza pizza = new VeggiePizzaDecorator( new PlainPizza() );
		pizza.bake();
	}
}
