package com.test.hammad;

public class ShipFactoryImplementation implements ShipFactory {

	@Override
	public EnemyShip getEnemyShipByName(String name) {
		EnemyShip ship = null;

		if (name.equals("UFO"))
			ship = new UfoEnemyShip();
		else if (name.equals("Big UFO"))
			ship = new BigUfoEnemyShip();
		else if (name.equals("Rocket"))
			ship = new RocketEnemyShip();

		return ship;
	}

}
