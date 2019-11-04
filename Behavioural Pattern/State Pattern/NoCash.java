package com.test.hammad;

public class NoCash implements AtmState {

	AtmMachine atmMachine;

	public NoCash(AtmMachine a) {
		atmMachine = a;
	}

	@Override
	public void insertCard() {
		System.out.println("We Dont have money");
	}

	@Override
	public void ejectCard() {
		System.out.println("We Dont have money");
	}

	@Override
	public void insertPin(int pin) {
		System.out.println("We Dont have money");
	}

	@Override
	public void requestCash(int amount) {
		System.out.println("We Dont have money");
	}

}
