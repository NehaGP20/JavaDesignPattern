package com.practice.patterns.factory;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing CheesePizza Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking CheesePizza Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Slicing CheesePizza Pizza");
	}

}
