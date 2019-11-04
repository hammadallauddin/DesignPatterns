package com.test.hammad;

public class HasPin implements AtmState {

	AtmMachine atmMachine;

	public HasPin(AtmMachine a) {
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
		System.out.println("Correct PIN");
	}

	@Override
	public void requestCash(int amount) {
		if (atmMachine.cashInMachine > amount) {
			System.out.println("Cash Withdraw Successfulyy");
			atmMachine.cashInMachine = atmMachine.cashInMachine - amount;
		} else {
			System.out.println("Dont have enough cash");
			System.out.println("Card Ejected");
			atmMachine.setAtmState(atmMachine.getNoCardState());
		}
	}

}
