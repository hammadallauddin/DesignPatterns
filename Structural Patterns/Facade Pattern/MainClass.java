package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {

		BankAccountFacade facade = new BankAccountFacade(12345, 1212);
		facade.depositCash(100);
		facade.withdrawCash(100000000);
		facade.withdrawCash(200);
		
	}
}
