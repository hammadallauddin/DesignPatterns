package com.test.hammad;

abstract class Remote {
	private EntertainmentDevice device;

	public Remote(EntertainmentDevice device) {
		this.device = device;
	}

	public abstract void buttonNinePressed();

	public void buttonFivePressed() {
		device.buttonFivePressed();
	}
	
	public void buttonSixPressed() {
		device.buttonSixPressed();
	}

	public void deviceFeeback() {
		device.deviceFeedback();
	}

}
