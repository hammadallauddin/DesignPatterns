package com.test.hammad;

public class ToppingDecorator implements Pizza {

	protected Pizza pizza;

	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

	@Override
	public int getCost() {
		return pizza.getCost();
	}

}
