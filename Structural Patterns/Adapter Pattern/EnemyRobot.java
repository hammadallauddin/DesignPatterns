package com.test.hammad;

import java.util.Random;

public class EnemyRobot {

	Random random = new Random();

	public void smashWithHands() {
		int damage = random.nextInt(10) + 1;
		System.out.println("Smash with hands cause " + damage + " damage");
	}

	public void walkFowrward() {
		int movement = random.nextInt(5) + 1;
		System.out.println("Enemy Robot walk " + movement + " km");
	}

	public void reactToHuman(String name) {
		System.out.println("Meets with " + name);
	}

}
