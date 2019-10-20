package com.test.hammad;

public class UfoFactory implements EnemyShipFactory {

	public UfoFactory() {

	}

	@Override
	public EnemyShipEngine addEngine() {
		return new UfoEngine();
	}

	@Override
	public EnemyShipWeapon addWeapon() {
		return new UfoWeapon();
	}

}
