package com.test.hammad;

public class Gallons extends Expression {

	@Override
	public String gallon(double quantity) {
		return String.valueOf(quantity);
	}

	@Override
	public String quarts(double quantity) {
		return String.valueOf(quantity * 4);
	}

	@Override
	public String pints(double quantity) {
		return String.valueOf(quantity * 8);
	}

	@Override
	public String cups(double quantity) {
		return String.valueOf(quantity * 16);
	}

	@Override
	public String tableSpoons(double quantity) {
		return String.valueOf(quantity * 256);
	}

}
