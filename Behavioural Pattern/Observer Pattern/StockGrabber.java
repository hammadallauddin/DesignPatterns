package com.test.hammad;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	List<Observer> observers;

	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int observerIndex = observers.indexOf(o);
		System.out.println("Observer with id " + (observerIndex + 1) + " deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(ibmPrice, applePrice, googlePrice);
		}
	}

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
		notifyObserver();
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public double getApplePrice() {
		return applePrice;
	}

	public double getGooglePrice() {
		return googlePrice;
	}
}
