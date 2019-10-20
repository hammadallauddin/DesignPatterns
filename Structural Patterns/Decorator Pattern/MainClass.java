package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {
		Pizza pizza = new Mozzarella(new Fajjita(new PlainPizza()));
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}
}
