package com.test.hammad;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

	private int startTime;
	private String stock;
	private double price;

	private Subject stockGrabber;

	public GetTheStock(Subject stockGrabber, int startTime, String stock, double price) {
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
		this.stockGrabber = stockGrabber;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}

			double randNumber = (Math.random() * (0.06)) - 0.03;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format(randNumber));

			if (stock == "IBM")
				((StockGrabber) stockGrabber).setIbmPrice(price);
			
			if (stock == "APPLE")
				((StockGrabber) stockGrabber).setApplePrice(price);
			
			if (stock == "GOOGLE")
				((StockGrabber) stockGrabber).setGooglePrice(price);

			System.out.println(stock + ": " + df.format((price + randNumber)) + " " + df.format(price + randNumber));
			System.out.println();
		}
	}

}
