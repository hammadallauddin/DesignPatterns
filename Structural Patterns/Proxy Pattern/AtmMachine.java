package com.test.hammad;

public class AtmMachine implements GetAtmData {

	AtmState hasCard;
	AtmState noCard;
	AtmState hasCorrectPin;
	AtmState atmOutOfMoney;

	AtmState atmState;

	int cashInMachine = 2000;
	boolean isCorrectPin = false;

	public AtmMachine() {
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);

		atmState = noCard;

		if (cashInMachine <= 0) {
			atmState = atmOutOfMoney;
		}
	}

	public void setAtmState(AtmState state) {
		atmState = state;
	}

	public void setCashInMachine(int newCashInMachine) {
		cashInMachine = newCashInMachine;
	}

	public void insertCard() {
		atmState.insertCard();
	}

	public void ejectCard() {
		atmState.ejectCard();
	}

	public void requestMoney(int cash) {
		atmState.requestCash(cash);
	}

	public void insertPin(int pin) {
		atmState.insertPin(pin);
	}

	public AtmState getYesCardState() {
		return hasCard;
	}

	public AtmState getNoCardState() {
		return noCard;
	}

	public AtmState getHasPin() {
		return hasCorrectPin;
	}

	public AtmState getNoCashState() {
		return atmOutOfMoney;
	}

	@Override
	public AtmState getAtmState() {
		return atmState;
	}

	@Override
	public int getCashInMachine() {
		return cashInMachine;
	}
}
