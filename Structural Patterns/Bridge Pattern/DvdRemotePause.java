package com.test.hammad;

public class DvdRemotePause extends Remote {

	public DvdRemotePause(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("DVD is pause");
	}

}
