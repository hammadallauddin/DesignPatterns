package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {

		EnemyAttacker tank = new EnemyTank();
		tank.fireWeapon();
		tank.driveForward();
		tank.assignDriver("Hammad");

		System.out.println();

		EnemyRobot robot = new EnemyRobot();
		robot.smashWithHands();
		robot.walkFowrward();
		robot.reactToHuman("Robot");

		System.out.println();

		EnemyRobotAdapter adapter = new EnemyRobotAdapter(robot);
		adapter.fireWeapon();
		adapter.driveForward();
		adapter.assignDriver("Hammad Adapter");
	}
}
