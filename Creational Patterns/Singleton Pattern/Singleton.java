package com.test.hammad;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d",
			"d", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i",
			"i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n",
			"o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "s", "s", "s", "s", "t", "t", "t", "t",
			"t", "u", "u", "u", "u", "v", "w", "w", "x", "y", "y", "z" };

	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

	static boolean firstThread = true;

	// Singleton code start

	private static Singleton firstInstance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {

		// Does it intentionally to see that singleton implementation will fail
		// when multi threaded requests come
		if (firstThread) {
			firstThread = false;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// solve the issue we created above by using below method
		// it will never allow other thread to come here until first thread completed
		synchronized (Singleton.class) {
			if (firstInstance == null) {
				firstInstance = new Singleton();
				Collections.shuffle(firstInstance.letterList);
			}
		}

		return firstInstance;

		// Singleton code end
	}

	public LinkedList<String> getLetterList() {
		return firstInstance.letterList;
	}

	public LinkedList<String> getTiles(int tilesNumber) {
		LinkedList<String> listToSend = new LinkedList<String>();
		for (int i = 0; i <= tilesNumber; i++) {
			listToSend.add(firstInstance.letterList.remove(0));
		}
		return listToSend;
	}
}
