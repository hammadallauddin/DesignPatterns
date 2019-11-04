package com.test.hammad;

public class DvdDevice extends EntertainmentDevice {

	public DvdDevice(int newDeviceState, int newMaxSetting) {
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}

	@Override
	public void buttonFivePressed() {
		System.out.println("Channel Down");
		deviceState--;
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("Channel Up");
		deviceState++;
	}

}
