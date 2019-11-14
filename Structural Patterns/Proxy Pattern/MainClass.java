package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {
		AtmMachine machine = new AtmMachine();

		machine.insertCard();
		machine.ejectCard();

		machine.insertCard();
		machine.insertPin(1234);
		machine.requestMoney(2000);

		machine.insertCard();
		machine.insertPin(1233);

		machine.insertCard();
		machine.insertPin(1234);
		machine.requestMoney(200);

		// FOR PROXY PATTERN

		GetAtmData atmMachine = new AtmMachine();
		GetAtmData atmProxy = new AtmProxy();

		System.out.println("ATM STATE IS : " + atmProxy.getAtmState());
		System.out.println("ATM CASH IS : " + atmProxy.getCashInMachine());

	}
}
