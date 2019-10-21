package com.test.hammad;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;

	WelcomeToBank welcomeToBank;
	AccountNumberCheck accountNumberCheck;
	SecurityCodeCheck securityCodeCheck;
	FundsCheck fundsCheck;

	public BankAccountFacade(int accNo, int secCode) {
		this.accountNumber = accNo;
		this.securityCode = secCode;

		welcomeToBank = new WelcomeToBank();
		accountNumberCheck = new AccountNumberCheck();
		securityCodeCheck = new SecurityCodeCheck();
		fundsCheck = new FundsCheck();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void withdrawCash(double amount) {
		if (accountNumberCheck.isValidAccountNumber(getAccountNumber())
				&& securityCodeCheck.isValidCode(getSecurityCode()) && fundsCheck.haveEnoughMoney(amount)) {
			System.out.println("Transaction Completed");
		} else {
			System.out.println("Transaction Failed");
		}
	}

	public void depositCash(double amount) {
		if (accountNumberCheck.isValidAccountNumber(getAccountNumber())
				&& securityCodeCheck.isValidCode(getSecurityCode())) {
			fundsCheck.depositAccount(amount);
			System.out.println("Transaction Completed");
		} else {
			System.out.println("Transaction Failed");
		}
	}

}
