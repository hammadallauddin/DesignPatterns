package com.test.hammad;

public class MulNumber implements Chain {

	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers numbers) {
		if (numbers.getSelecter().equals("DIV")) {
			System.out.println("Result of Div: " + (numbers.getN1() / numbers.getN2()));
		} else {
			System.out.println("Not Working in this Object");
		}
	}

}
