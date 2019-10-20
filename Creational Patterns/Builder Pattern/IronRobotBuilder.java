package com.test.hammad;

public class IronRobotBuilder implements RobotBuilder {

	private Robot robot;

	public IronRobotBuilder() {
		robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setHead("Iron Head");
	}

	@Override
	public void buildRobotHands() {
		robot.setHands("Iron Hand");
	}

	@Override
	public void buildRobotLegs() {
		robot.setLegs("Iron Legs");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
