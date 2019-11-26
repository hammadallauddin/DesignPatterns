package com.test.hammad;

public class NecessityItem implements Visitable {

	private double price;

	public NecessityItem(double price) {
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
