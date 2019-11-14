package com.test.hammad;

public class SubNumber implements Chain {

	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers numbers) {
		if (numbers.getSelecter().equals("SUB")) {
			System.out.println("Result of Sub: " + (numbers.getN1() - numbers.getN2()));
		} else {
			nextChain.calculate(numbers);
		}
	}

}
