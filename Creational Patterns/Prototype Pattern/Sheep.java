package com.test.hammad;

public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep is made");
	}

	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is cloned");
		Sheep sheepObject = null;
		try {
			sheepObject = (Sheep) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sheepObject;
	}

	public String toString() {
		return "Here in sheep class";
	}

}
