package com.practice.patterns.factory;

public class PizzaFactory {

	//Static method used to create appropriate type of pizza object
	public static Pizza createPizza(String type) {
		Pizza p = null;

		if (type.equals("cheese")) {
			p = new CheesePizza();
		} else if (type.equals("corn")) {
			p = new CornPizza();
		} else if (type.equals("veggie")) {
			p = new VegPizza();
		}

		return p;
	}

}
