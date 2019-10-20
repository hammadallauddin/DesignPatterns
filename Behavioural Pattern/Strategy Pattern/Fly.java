package com.test.hammad;

public interface Fly {
	String fly();
}

class CanFly implements Fly {

	@Override
	public String fly() {
		return "It can fly";
	}

}

class CanNotFly implements Fly {

	@Override
	public String fly() {
		return "It can not fly";
	}

}