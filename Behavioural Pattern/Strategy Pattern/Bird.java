package com.test.hammad;

public class Bird extends Animal {

	public Bird() {
		super();
		setSound("Tweet");
		flyingAbility(new CanFly());
	}
}
