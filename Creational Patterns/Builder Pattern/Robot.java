package com.test.hammad;

public class Robot implements RobotPlan {

	private String head;
	private String hands;
	private String legs;

	@Override
	public void setHead(String head) {
		this.head = head;
	}

	@Override
	public void setHands(String hands) {
		this.hands = hands;
	}

	@Override
	public void setLegs(String legs) {
		this.legs = legs;
	}

	public String getHead() {
		return head;
	}

	public String getHands() {
		return hands;
	}

	public String getLegs() {
		return legs;
	}

}
