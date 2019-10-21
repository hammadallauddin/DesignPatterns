package com.test.hammad;

public class AirConditioner implements ElectronicDevice {

	@Override
	public void on() {
		System.out.println("AC is on");
	}

	@Override
	public void off() {
		System.out.println("AC is off");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub

	}

}
