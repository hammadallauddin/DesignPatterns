package com.test.hammad;

public class TurnTvVolumeDown implements Command {

	ElectronicDevice device;

	public TurnTvVolumeDown(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeDown();
	}

}
