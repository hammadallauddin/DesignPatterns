package com.test.hammad;

public class EnemyShipBuildingImpl extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip ship = null;

		if (typeOfShip.equals("UFO")) {
			EnemyShipFactory factory = new UfoFactory();
			ship = new UfoShip(factory);
			ship.setName("UFO SHIP");
		} else if (typeOfShip.equals("Rocket")) {
			EnemyShipFactory factory = new RocketFactory();
			ship = new UfoShip(factory);
			ship.setName("ROCKET SHIP");
		}
		return ship;
	}

}
