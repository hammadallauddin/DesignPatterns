package com.test.hammad;

abstract class Pizza {

	final void makePizza() {
		makeDough();

		if (customerWantsMeat()) {
			addMeat();
		}

		if (customerWantsCheese()) {
			addCheese();
		}

		if (customerWantsVegatable()) {
			addVegatable();
		}

		wrapThePizza();
	}

	public abstract void addMeat();

	public abstract void addCheese();

	public abstract void addVegatable();

	boolean customerWantsMeat() {
		return true;
	}

	boolean customerWantsCheese() {
		return true;
	}

	boolean customerWantsVegatable() {
		return true;
	}

	void makeDough() {
		System.out.print("\nDough is made");
	}

	void wrapThePizza() {
		System.out.print("\nPizza is Cut");
	}
}
