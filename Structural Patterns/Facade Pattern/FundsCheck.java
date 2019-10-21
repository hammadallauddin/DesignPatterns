package com.test.hammad;

public class FundsCheck {

	private double cashInAccount = 12345;

	public double getCashInAccount() {
		return cashInAccount;
	}

	public void decreaseCashInAccount(double cash) {
		cashInAccount = cashInAccount - cash;
	}

	public void increaseCashInAccount(double cash) {
		cashInAccount = cashInAccount + cash;
	}

	public boolean haveEnoughMoney(double cash) {
		boolean result = false;
		if (cash > getCashInAccount()) {
			System.out.println("You dont have enough money");
			result = false;
		} else {
			decreaseCashInAccount(cash);
			System.out.println("Withdrawal comleted balance is " + getCashInAccount());
			result = true;
		}
		return result;
	}

	public boolean depositAccount(double cash) {
		increaseCashInAccount(cash);
		System.out.println("Deposit comleted balance is " + getCashInAccount());
		return true;
	}

}
