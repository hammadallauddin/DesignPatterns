package com.test.hammad;

public class TurnTvOff implements Command {

	ElectronicDevice device;

	public TurnTvOff(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.off();
	}

}
