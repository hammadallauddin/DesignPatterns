package com.test.hammad;

public class DeviceButton {

	Command command;

	public DeviceButton(Command command) {
		this.command = command;
	}

	public void press() {
		command.execute();
	}
}
