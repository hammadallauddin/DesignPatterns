package com.test.hammad;

public abstract class EnemyShipBuilding {

	protected abstract EnemyShip makeEnemyShip(String typeOfShip);

	public EnemyShip orderTheShip(String typeOfShip) {
		EnemyShip enemyShip = makeEnemyShip(typeOfShip);

		enemyShip.makeShip();
		enemyShip.getShipInfo();

		return enemyShip;
	}
}
