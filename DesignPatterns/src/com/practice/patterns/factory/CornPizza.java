package com.practice.patterns.factory;

public class CornPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing CornPizza Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking CornPizza Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Slicing CornPizza Pizza");
	}

}
