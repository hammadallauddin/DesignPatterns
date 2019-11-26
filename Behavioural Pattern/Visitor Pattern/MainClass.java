package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {

		TaxVisitor visitor = new TaxVisitor();

		Visitable milk = new NecessityItem(110);
		Visitable beer = new LiquorItem(1000);
		Visitable cigar = new TobaccoItem(200);

		System.out.println(milk.accept(visitor));
		System.out.println(beer.accept(visitor));
		System.out.println(cigar.accept(visitor));
	}
}
