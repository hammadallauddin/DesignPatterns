package com.test.hammad;

public class SteelRobotBuilder implements RobotBuilder {

	private Robot robot;

	public SteelRobotBuilder() {
		robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setHead("Steel Head");
	}

	@Override
	public void buildRobotHands() {
		robot.setHands("Steel Hand");
	}

	@Override
	public void buildRobotLegs() {
		robot.setLegs("Steel Legs");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}
}
