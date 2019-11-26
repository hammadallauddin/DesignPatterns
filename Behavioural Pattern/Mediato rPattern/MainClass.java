package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {

		StockMediator mediator = new StockMediator();
		GermanSlacks germanSlacks = new GermanSlacks(mediator);
		JTPoorman jtPoorman = new JTPoorman(mediator);

		germanSlacks.saleOffer("MSFT", 100);
		germanSlacks.saleOffer("GOOG", 60);

		jtPoorman.saleOffer("NSF", 30);
		jtPoorman.buyOffer("GOOG", 50);

		germanSlacks.buyOffer("NSF", 10);

		System.out.println();

		mediator.getStockOffering();
	}
}
