package com.test.hammad;

public class VegPizza extends Pizza {

	String[] vagatable = { "Onion", "Tomato" };

	boolean customerWantsMeat() {
		return false;
	}

	boolean customerWantsCheese() {
		return false;
	}

	@Override
	public void addMeat() {

	}

	@Override
	public void addCheese() {

	}

	@Override
	public void addVegatable() {
		System.out.print("\nAdding the vegatable ");
		for (String v : vagatable) {
			System.out.print(v + " ");
		}
	}
}
