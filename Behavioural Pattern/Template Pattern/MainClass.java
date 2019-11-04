package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {
		Pizza vegPizza = new VegPizza();
		vegPizza.makePizza();
		System.out.println();
		Pizza italianPizza = new ItalianPizza();
		italianPizza.makePizza();
	}
}
