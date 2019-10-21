package com.test.hammad;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

	Random random = new Random();

	@Override
	public void fireWeapon() {
		int damage = random.nextInt(10) + 1;
		System.out.println("Enemy tank does " + damage + " damage");
	}

	@Override
	public void driveForward() {
		int movement = random.nextInt(5) + 1;
		System.out.println("Enemy tank moves " + movement + " km");
	}

	@Override
	public void assignDriver(String driverName) {
		System.out.println("Driver name is " + driverName);
	}

}
