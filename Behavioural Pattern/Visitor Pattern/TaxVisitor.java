package com.test.hammad;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
	DecimalFormat df = new DecimalFormat("#.##");

	public TaxVisitor() {

	}

	@Override
	public double visit(LiquorItem item) {
		System.out.println("Liquor Item prices with tax");
		return Double.parseDouble(df.format((item.getPrice()) * 0.31 + item.getPrice()));
	}

	@Override
	public double visit(TobaccoItem item) {
		System.out.println("Tobaco Item prices with tax");
		return Double.parseDouble(df.format((item.getPrice()) * 0.51 + item.getPrice()));
	}

	@Override
	public double visit(NecessityItem item) {
		System.out.println("Necessity Item prices with tax");
		return Double.parseDouble(df.format((item.getPrice()) * 0.11 + item.getPrice()));
	}
}
