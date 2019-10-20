package com.test.hammad;

public abstract class EnemyShip {

	private String name;
	EnemyShipEngine engine;
	EnemyShipWeapon weapon;

	abstract void makeShip();

	String getShipInfo() {
		String info = "The " + name + " has " + engine.getEngine() + " and " + weapon.getWeapon();
		return info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnemyShipEngine getEngine() {
		return engine;
	}

	public void setEngine(EnemyShipEngine engine) {
		this.engine = engine;
	}

	public EnemyShipWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(EnemyShipWeapon weapon) {
		this.weapon = weapon;
	}

}
