package com.test.hammad;

public class MainClass {
	public static void main(String[] args) {

		StockGrabber grabber = new StockGrabber();

		// NOT VIA THREADING
		StockObserver observer1 = new StockObserver(grabber);
		StockObserver observer2 = new StockObserver(grabber);
		grabber.setApplePrice(100);
		grabber.setGooglePrice(1000);
		grabber.setIbmPrice(10000);
		grabber.unregister(observer2);
		grabber.setIbmPrice(50);

		// VIA THREADING
		Runnable getIbRunnable1 = new GetTheStock(grabber, 2, "IBM", 198.00);
		Runnable getIbRunnable2 = new GetTheStock(grabber, 2, "APPLE", 298.00);
		Runnable getIbRunnable3 = new GetTheStock(grabber, 2, "GOOGLE", 398.00);

		new Thread(getIbRunnable1).start();
		new Thread(getIbRunnable2).start();
		new Thread(getIbRunnable3).start();
	}
}