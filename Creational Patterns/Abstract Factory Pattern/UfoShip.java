package com.test.hammad;

public class UfoShip extends EnemyShip {

	EnemyShipFactory factory = null;

	public UfoShip(EnemyShipFactory factory) {
		this.factory = factory;
	}

	@Override
	void makeShip() {
		System.out.println("Making enemy ship " + getName());
		engine = factory.addEngine();
		weapon = factory.addWeapon();
	}

}
