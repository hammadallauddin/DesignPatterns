package com.test.hammad;

public class TurnAcOn implements Command {

	ElectronicDevice device;

	public TurnAcOn(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.on();
	}

}
