package com.test.hammad;

public class MainClass {
	public static void main(String[] args) {

		EnemyShipBuilding makeUFOs = new EnemyShipBuildingImpl();
		EnemyShip ufoShip = makeUFOs.orderTheShip("UFO");
		System.out.println(ufoShip.getShipInfo());

		System.out.println();

		EnemyShip rocketShi = makeUFOs.orderTheShip("Rocket");
		System.out.println(rocketShi.getShipInfo());
	}
}