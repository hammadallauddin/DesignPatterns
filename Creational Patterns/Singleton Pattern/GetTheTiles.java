package com.test.hammad;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		Singleton singleton = Singleton.getInstance();
		System.out.println("Instance ID: " + System.identityHashCode(singleton));
		System.out.println(singleton.getLetterList());
		LinkedList<String> list = singleton.getTiles(7);
		System.out.println("Player : " + list);
		System.out.println(singleton.getLetterList());
		System.out.println("Tiles Got");
	}
}
