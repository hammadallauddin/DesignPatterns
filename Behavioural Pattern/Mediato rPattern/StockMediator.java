package com.test.hammad;

import java.util.ArrayList;

public class StockMediator implements Mediator {

	private int colleagueCode = 0;

	ArrayList<Colleague> colleagues;
	ArrayList<StockOffer> stockBuyOffers;
	ArrayList<StockOffer> stockSellOffers;

	public StockMediator() {
		colleagues = new ArrayList<>();
		stockBuyOffers = new ArrayList<>();
		stockSellOffers = new ArrayList<>();
	}

	@Override
	public void setCollCode(Colleague colleague) {
		colleagues.add(colleague);
		colleagueCode++;
		colleague.setCollCode(colleagueCode);
	}

	public void saleOffer(String stock, int shares, int colleagueCode) {
		boolean stockSold = false;

		for (StockOffer offer : stockBuyOffers) {
			if ((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)) {
				System.out.println(
						shares + " shares of " + stock + " sold to colleague code " + offer.getColleagueCode());

				stockBuyOffers.remove(offer);
				stockSold = true;
			}

			if (stockSold) {
				break;
			}
		}

		if (!stockSold) {
			System.out.println(shares + " shares of " + stock + " added to inventory");
			StockOffer offer = new StockOffer(shares, stock, colleagueCode);
			stockSellOffers.add(offer);
		}
	}

	public void buyOffer(String stock, int shares, int colleagueCode) {
		boolean stockBought = false;

		for (StockOffer offer : stockSellOffers) {
			if ((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)) {
				System.out.println(
						shares + " shares of " + stock + " bought to colleague code " + offer.getColleagueCode());

				stockSellOffers.remove(offer);
				stockBought = true;
			}

			if (stockBought)
				break;
		}

		if (!stockBought) {
			System.out.println(shares + " shares of " + stock + " added to inventory");
			StockOffer offer = new StockOffer(shares, stock, colleagueCode);
			stockBuyOffers.add(offer);
		}
	}

	public void getStockOffering() {
		System.out.println("Stock For Sale");
		for (StockOffer offer : stockSellOffers) {
			System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
		}

		System.out.println("Stock For Buy");
		for (StockOffer offer : stockBuyOffers) {
			System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
		}

	}

}
