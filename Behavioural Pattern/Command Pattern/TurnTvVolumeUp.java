package com.test.hammad;

public class TurnTvVolumeUp implements Command {

	ElectronicDevice device;

	public TurnTvVolumeUp(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeUp();
	}

}
