package com.test.hammad;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainClass {

	public static void main(String[] args) {
		Class reflection = ReflectionDummy.class;

		System.out.println(reflection.getName());

		int modifier = reflection.getModifiers();
		System.out.println(Modifier.isPublic(modifier));

		Class[] interfaces = reflection.getInterfaces();

		Class superClass = reflection.getSuperclass();

		Method[] methods = reflection.getMethods();

		Class[] parameterTypes = methods[0].getParameterTypes();

		try {
			Constructor constructor = reflection.getConstructor();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		try {
			Field privateField = reflection.getDeclaredField("number");
			privateField.setAccessible(true);
			System.out.print(privateField.toString());
		} catch (Exception e) {
			System.out.print(e);
		}

	}
}
