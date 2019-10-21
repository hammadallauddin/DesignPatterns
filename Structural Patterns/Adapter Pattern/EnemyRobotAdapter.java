package com.test.hammad;

import java.util.Random;

public class EnemyRobotAdapter implements EnemyAttacker {

	Random random = new Random();

	EnemyRobot robot;

	public EnemyRobotAdapter(EnemyRobot robot) {
		this.robot = robot;
	}

	@Override
	public void fireWeapon() {
		robot.smashWithHands();
	}

	@Override
	public void driveForward() {
		robot.walkFowrward();
	}

	@Override
	public void assignDriver(String driverName) {
		robot.reactToHuman(driverName);
	}

}
