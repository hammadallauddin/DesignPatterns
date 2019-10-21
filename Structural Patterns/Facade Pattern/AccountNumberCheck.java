package com.test.hammad;

public class AccountNumberCheck {

	private int accountNumber = 12345;

	public int getAccountNUmber() {
		return accountNumber;
	}

	public boolean isValidAccountNumber(int number) {
		boolean result = false;

		if (number == getAccountNUmber())
			result = true;
		else
			System.out.println("Incorrect Account Number");

		return result;
	}
}
