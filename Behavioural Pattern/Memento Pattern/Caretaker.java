package com.test.hammad;

import java.util.ArrayList;

public class Caretaker {

	ArrayList<Memento> savedArticles = new ArrayList<>();

	public void addMemento(Memento m) {
		this.savedArticles.add(m);
	}

	public Memento getMemento(int index) {
		return this.savedArticles.get(index);
	}

}
