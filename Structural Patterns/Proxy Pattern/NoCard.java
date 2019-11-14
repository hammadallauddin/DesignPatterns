package com.test.hammad;

public class NoCard implements AtmState {

	AtmMachine atmMachine;

	public NoCard(AtmMachine a) {
		atmMachine = a;
	}

	@Override
	public void insertCard() {
		System.out.println("Please Enter a Pin");
		atmMachine.setAtmState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		System.out.println("Enter card First");
	}

	@Override
	public void insertPin(int pin) {
		System.out.println("Enter card First");
	}

	@Override
	public void requestCash(int amount) {
		System.out.println("Enter card First");
	}

}