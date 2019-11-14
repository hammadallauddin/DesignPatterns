package com.test.hammad;

public class AddNumber implements Chain {

	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers numbers) {
		if (numbers.getSelecter().equals("ADD")) {
			System.out.println("Result of ADD: " + (numbers.getN1() + numbers.getN2()));
		} else {
			nextChain.calculate(numbers);
		}
	}

}
