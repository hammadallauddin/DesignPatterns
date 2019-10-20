package com.test.hammad;

public class Fajjita extends ToppingDecorator {

	public Fajjita(Pizza pizza) {
		super(pizza);

		System.out.println("Adding Dough");
		System.out.println("Adding Sauce");
	}

	public String getDescription() {
		return pizza.getDescription() + " Sauce";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 5;
	}

}
