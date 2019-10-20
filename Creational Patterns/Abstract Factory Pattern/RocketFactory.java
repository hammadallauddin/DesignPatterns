package com.test.hammad;

public class RocketFactory implements EnemyShipFactory {

	public RocketFactory() {

	}

	@Override
	public EnemyShipEngine addEngine() {
		return new RocketEngine();
	}

	@Override
	public EnemyShipWeapon addWeapon() {
		return new RocketWeapon();
	}

}
