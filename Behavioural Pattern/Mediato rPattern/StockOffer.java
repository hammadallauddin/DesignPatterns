package com.test.hammad;

public class StockOffer {

	private int stockShares = 0;
	private String stockSymbol = "";
	private int colleagueCode = 0;

	public StockOffer(int numOfShare, String stock, int colleagueCode) {
		this.stockShares = numOfShare;
		this.stockSymbol = stock;
		this.colleagueCode = colleagueCode;
	}

	public int getStockShares() {
		return stockShares;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public int getColleagueCode() {
		return colleagueCode;
	}
}
