package com.test.hammad;

public abstract class EnemyShip {
	private String name;
	private double totalDamage;

	public void followHeroShip() {
		System.out.println(getName() + " is following hero");
	}

	public void displayEnemyShip() {
		System.out.println(getName() + " is on screen");
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attack and does " + getTotalDamage() + " damage");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalDamage() {
		return totalDamage;
	}

	public void setTotalDamage(double totalDamage) {
		this.totalDamage = totalDamage;
	}

}
