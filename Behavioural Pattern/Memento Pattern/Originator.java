package com.test.hammad;

public class Originator {

	private String article;

	public void set(String article) {

		System.out.println("The Current version of article is " + article);

		this.article = article;
	}

	public Memento storeInMemento() {
		System.out.println("From originator: Saving in memento");
		return new Memento(this.article);
	}

	public String restoreFromMemento(Memento memento) {
		this.article = memento.getSavedArticle();
		System.out.println("From Originator: Previous article saved in memento");
		return this.article;
	}

}
