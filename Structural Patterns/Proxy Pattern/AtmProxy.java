package com.test.hammad;

public class AtmProxy implements GetAtmData {

	@Override
	public AtmState getAtmState() {
		AtmMachine atmMachine = new AtmMachine();
		return atmMachine.getAtmState();
	}

	@Override
	public int getCashInMachine() {
		AtmMachine atmMachine = new AtmMachine();
		return atmMachine.getCashInMachine();
	}

}
