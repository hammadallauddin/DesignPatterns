package com.test.hammad;

public class Dog extends Animal {

	public Dog() {
		super();
		setSound("Bark");
		flyingAbility(new CanNotFly());
	}

	public void digHole() {
		System.out.print("It is digging hole");
	}
}
