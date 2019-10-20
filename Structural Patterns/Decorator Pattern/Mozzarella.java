package com.test.hammad;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza pizza) {
		super(pizza);

		System.out.println("Adding Dough");
		System.out.println("Adding Mozzarella");
	}

	public String getDescription() {
		return pizza.getDescription() + " Mozzarella";
	}

	@Override
	public int getCost() {
		return pizza.getCost() + 2;
	}

}
