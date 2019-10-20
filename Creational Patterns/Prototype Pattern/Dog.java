package com.test.hammad;

public class Dog implements Animal {

	public Dog() {
		System.out.println("Dog is made");
	}

	@Override
	public Animal makeCopy() {
		System.out.println("Dog is cloned");
		Dog dogObject = null;
		try {
			dogObject = (Dog) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dogObject;
	}

	public String toString() {
		return "Here in Dog class";
	}
}
