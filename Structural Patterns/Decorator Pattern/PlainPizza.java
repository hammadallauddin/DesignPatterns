package com.test.hammad;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Thin Dough";
	}

	@Override
	public int getCost() {
		return 10;
	}

}
