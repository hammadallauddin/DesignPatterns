package com.test.hammad;

public class ItalianPizza extends Pizza {

	String[] meat = { "Chikken Tikka", "Fajjita" };
	String[] cheese = { "Mozarralla" };
	String[] vagatable = { "Onion", "Tomato" };

	@Override
	public void addMeat() {
		System.out.print("\nAdding the meat ");
		for (String m : meat) {
			System.out.print(m + " ");
		}
	}

	@Override
	public void addCheese() {
		System.out.print("\nAdding the cheese ");
		for (String c : cheese) {
			System.out.print(c + " ");
		}
	}

	@Override
	public void addVegatable() {
		System.out.print("\nAdding the vegatable ");
		for (String v : vagatable) {
			System.out.print(v + " ");
		}
	}
}
