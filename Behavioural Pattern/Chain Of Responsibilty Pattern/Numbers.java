package com.test.hammad;

public class Numbers {

	private int n1;
	private int n2;
	private String selecter;

	public Numbers(int n1, int n2, String selecter) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.selecter = selecter;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public String getSelecter() {
		return selecter;
	}

	public void setSelecter(String selecter) {
		this.selecter = selecter;
	}

}
