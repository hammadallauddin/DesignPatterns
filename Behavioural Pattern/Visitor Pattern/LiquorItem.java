package com.test.hammad;

public class LiquorItem implements Visitable {

	private double price;

	public LiquorItem(double price) {
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
