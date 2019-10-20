package com.test.hammad;

public abstract class Animal {

	private String name;
	private double height;
	private int weight;
	private String favFood;
	private String sound;
	private Fly flyingAbility;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public void flyingAbility(Fly fly) {
		flyingAbility = fly;
	}

	public String tryToFly() {
		return flyingAbility.fly();
	}
}
