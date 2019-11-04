package com.test.hammad;

public class DvdRemoteMute extends Remote {

	public DvdRemoteMute(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("DVD is muted");
	}

}
