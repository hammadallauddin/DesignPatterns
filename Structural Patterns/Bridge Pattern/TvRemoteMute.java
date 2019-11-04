package com.test.hammad;

public class TvRemoteMute extends Remote {

	public TvRemoteMute(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV is muted");
	}

}
