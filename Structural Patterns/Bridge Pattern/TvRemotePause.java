package com.test.hammad;

public class TvRemotePause extends Remote {

	public TvRemotePause(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV is pause");
	}

}
