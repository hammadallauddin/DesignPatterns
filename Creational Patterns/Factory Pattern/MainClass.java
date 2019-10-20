package com.test.hammad;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		String enemyShip = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Which Enemy Ship do you want? ");
		if (scanner.hasNextLine()) {
			enemyShip = scanner.nextLine();
		}

		ShipFactory factory = new ShipFactoryImplementation();
		doStuff(factory.getEnemyShipByName(enemyShip));
	}

	public static void doStuff(EnemyShip ship) {
		ship.displayEnemyShip();
		ship.followHeroShip();
		ship.enemyShipShoots();
	}
}