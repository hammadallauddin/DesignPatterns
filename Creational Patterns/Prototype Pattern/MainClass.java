package com.test.hammad;

public class MainClass {
	public static void main(String[] args) {
		Animal sheep = new Sheep();
		Animal clonedSheep = sheep.makeCopy();

		Animal dog = new Dog();
		Animal clonedDog = dog.makeCopy();
	}
}