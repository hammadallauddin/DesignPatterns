package com.test.hammad;

public class DivNumber implements Chain {

	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers numbers) {
		if (numbers.getSelecter().equals("MUL")) {
			System.out.println("Result of Mul: " + (numbers.getN1() * numbers.getN2()));
		} else {
			nextChain.calculate(numbers);
		}
	}

}
