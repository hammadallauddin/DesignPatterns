package com.test.hammad;

public class SecurityCodeCheck {

	private int securityCode = 1212;

	public int getSecurityCode() {
		return securityCode;
	}

	public boolean isValidCode(int number) {
		boolean result = false;

		if (number == getSecurityCode())
			result = true;
		else
			System.out.println("Incorrect Security Code");

		return result;
	}
}
