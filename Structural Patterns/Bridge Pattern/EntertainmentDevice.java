package com.test.hammad;

abstract class EntertainmentDevice {

	public int deviceState;
	public int maxSetting;
	public int volumeSetting = 0;

	public abstract void buttonFivePressed();

	public abstract void buttonSixPressed();

	public void deviceFeedback() {
		if (deviceState > maxSetting || deviceState < 0)
			deviceState = 0;
		System.out.println("On Device State");
	}

	public void volumeSevenPressed() {
		volumeSetting++;
		System.out.println("Volume at " + volumeSetting);
	}

	public void volumeEightPressed() {
		volumeSetting--;
		System.out.println("Volume at " + volumeSetting);
	}
}
