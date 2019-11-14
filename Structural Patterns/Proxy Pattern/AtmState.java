package com.test.hammad;

public interface AtmState {

	void insertCard();

	void ejectCard();

	void insertPin(int pin);

	void requestCash(int amount);
}
