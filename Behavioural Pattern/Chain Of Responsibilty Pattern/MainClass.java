package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {
		Chain chainCal1 = new AddNumber();
		Chain chainCal2 = new SubNumber();
		Chain chainCal3 = new MulNumber();
		Chain chainCal4 = new DivNumber();

		chainCal1.setNextChain(chainCal2);
		chainCal2.setNextChain(chainCal3);
		chainCal3.setNextChain(chainCal4);

		Numbers num = new Numbers(44, 5, "SUB");
		chainCal1.calculate(num);

	}
}
