package com.practice.patterns.factory;

public class VegPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing Veggie Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking Veggie Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Slicing Veggie Pizza");
	}

}
