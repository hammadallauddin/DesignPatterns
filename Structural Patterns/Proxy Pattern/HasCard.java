package com.test.hammad;

public class HasCard implements AtmState {

	AtmMachine atmMachine;

	public HasCard(AtmMachine a) {
		atmMachine = a;
	}

	@Override
	public void insertCard() {
		System.out.println("You cannot enter more than one card");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected");
		atmMachine.setAtmState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pin) {
		if (pin == 1234) {
			System.out.println("Correct PIN");
			atmMachine.isCorrectPin = true;
			atmMachine.setAtmState(atmMachine.getHasPin());
		} else {
			System.out.println("Wrong PIN");
			atmMachine.isCorrectPin = false;
			System.out.println("Card Ejected");
			atmMachine.setAtmState(atmMachine.getNoCardState());
		}
	}

	@Override
	public void requestCash(int amount) {
		System.out.println("Enter Pin First");
	}

}
