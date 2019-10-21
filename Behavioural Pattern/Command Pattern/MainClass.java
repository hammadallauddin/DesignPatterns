package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {

		// For TV
		ElectronicDevice device = TvRemote.getDevice();
		Command turnTvOn = new TurnTvOn(device);
		DeviceButton button = new DeviceButton(turnTvOn);
		button.press();

		Command turnTvOff = new TurnTvOff(device);
		button = new DeviceButton(turnTvOff);
		button.press();

		Command tvVoulumeUp = new TurnTvVolumeUp(device);
		button = new DeviceButton(tvVoulumeUp);
		button.press();

		Command tvVoulumeDown = new TurnTvVolumeDown(device);
		button = new DeviceButton(tvVoulumeDown);
		button.press();

		System.out.println();

		// For AC
		ElectronicDevice ac = new AirConditioner();
		Command turnAcOn = new TurnAcOn(ac);
		button = new DeviceButton(turnAcOn);
		button.press();

		Command turnAcOff = new TurnAcOff(ac);
		button = new DeviceButton(turnAcOff);
		button.press();
	}
}
