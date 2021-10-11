package com.practice.patterns.decorator;

public class PlainPizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Baking the plain base Pizza");
	}

}
