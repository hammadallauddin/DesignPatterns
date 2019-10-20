package com.test.hammad;

public class MainClass {
	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();

		System.out.println("Dog :" + sparky.tryToFly());
		System.out.println("Bird:" + tweety.tryToFly());

		sparky.flyingAbility(new CanFly());
		System.out.println("Dog :" + sparky.tryToFly());
	}
}