package com.test.hammad;

public class MainClass {
	public static void main(String[] args) {

		RobotBuilder steelBuilder = new SteelRobotBuilder();
		RobotEngineer steelRobotEngineer = new RobotEngineer(steelBuilder);
		steelRobotEngineer.makeRobot();
		Robot steelRobot = steelRobotEngineer.getRobot();
		System.out.println("Robot Head :" + steelRobot.getHead());
		System.out.println("Robot Hands :" + steelRobot.getHands());
		System.out.println("Robot Legs :" + steelRobot.getLegs());

		System.out.println();

		RobotBuilder ironBuilder = new IronRobotBuilder();
		RobotEngineer ironRobotEngineer = new RobotEngineer(ironBuilder);
		ironRobotEngineer.makeRobot();
		Robot ironRobot = ironRobotEngineer.getRobot();
		System.out.println("Robot Head :" + ironRobot.getHead());
		System.out.println("Robot Hands :" + ironRobot.getHands());
		System.out.println("Robot Legs :" + ironRobot.getLegs());
	}
}