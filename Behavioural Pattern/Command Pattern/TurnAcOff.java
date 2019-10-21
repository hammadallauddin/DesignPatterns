package com.test.hammad;

public class TurnAcOff implements Command {

	ElectronicDevice device;

	public TurnAcOff(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.off();
	}

}
