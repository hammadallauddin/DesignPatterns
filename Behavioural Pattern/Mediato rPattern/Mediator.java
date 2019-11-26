package com.test.hammad;

public interface Mediator {

	public void saleOffer(String stock, int shares, int colleagueCode);

	public void buyOffer(String stock, int shares, int colleagueCode);

	public void setCollCode(Colleague colleague);

}
