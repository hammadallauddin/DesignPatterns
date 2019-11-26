package com.test.hammad;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		String question = JOptionPane.showInputDialog(frame, "What is your Question");

		ConversionContext context = new ConversionContext(question);
		String fromConversion = context.getFromConversion();
		String toConversion = context.getToConversion();
		double quantity = context.getQuantity();

		try {
			Class myClass = Class.forName(fromConversion);
			Constructor con = myClass.getConstructor();
			Object convertFrom = (Expression) myClass.newInstance();
			Class[] paramType = new Class[] { Double.TYPE };
			Method conversionMethod = myClass.getMethod(toConversion, paramType);
			Object[] params = new Object[] { new Double(quantity) };
			String toQuantity = (String) conversionMethod.invoke(convertFrom, params);
			String answer = context.getResponse();
			System.out.print(answer);
			JOptionPane.showMessageDialog(null, answer);
			frame.dispose();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
