package com.test.hammad;

public class RocketShip extends EnemyShip {

	EnemyShipFactory factory = null;

	public RocketShip(EnemyShipFactory factory) {
		this.factory = factory;
	}

	@Override
	void makeShip() {
		System.out.println("Making enemy ship " + getName());
		engine = factory.addEngine();
		weapon = factory.addWeapon();
	}

}
