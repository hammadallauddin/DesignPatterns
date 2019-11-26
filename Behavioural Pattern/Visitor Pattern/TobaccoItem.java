package com.test.hammad;

public class TobaccoItem implements Visitable {

	private double price;

	public TobaccoItem(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
