package com.test.hammad;

import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {

		// Without Thread
		Singleton instanceOne = Singleton.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(instanceOne));
		System.out.println(instanceOne.getLetterList());

		LinkedList<String> playerOneTiles = instanceOne.getTiles(7);
		System.out.println("Player 1: " + playerOneTiles);
		System.out.println(instanceOne.getLetterList());

		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(instanceTwo));
		System.out.println(instanceTwo.getLetterList());

		LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
		System.out.println("Player 2: " + playerTwoTiles);
		System.out.println(instanceTwo.getLetterList());

		// With threads

		Runnable getTiles1 = new GetTheTiles();
		Runnable getTiles2 = new GetTheTiles();

		new Thread(getTiles1).start();
		new Thread(getTiles2).start();
	}
}