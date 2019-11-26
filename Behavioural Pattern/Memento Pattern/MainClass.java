package com.test.hammad;

public class MainClass {

	public static void main(String[] args) {

		int savedFiles = 0, currentFile = 0;
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();

		originator.set("Article1");
		caretaker.addMemento(originator.storeInMemento());
		savedFiles++;
		currentFile++;

		originator.set("Article2");
		caretaker.addMemento(originator.storeInMemento());
		savedFiles++;
		currentFile++;

		originator.set("Article3");
		caretaker.addMemento(originator.storeInMemento());
		savedFiles++;
		currentFile++;

		currentFile--;
		System.out.println();
		System.out.println("Current article is " + originator.restoreFromMemento(caretaker.getMemento(currentFile)));

		currentFile--;
		System.out.println();
		System.out.println("Current article is " + originator.restoreFromMemento(caretaker.getMemento(currentFile)));
		
		currentFile++;
		System.out.println();
		System.out.println("Current article is " + originator.restoreFromMemento(caretaker.getMemento(currentFile)));
	}
}
