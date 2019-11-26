package com.test.hammad;

public class ConversionContext {

	private String conversionQues = "";
	private String conversionResponse = "";
	private String fromConversion = "";
	private String toConversion = "";
	private double quantity;

	String[] partsOfQues;

	public ConversionContext(String input) {
		conversionQues = input;
		partsOfQues = getInput().split(" ");
		fromConversion = getCaptialized(partsOfQues[1]);
		toConversion = getLowerCase(partsOfQues[3]);
		quantity = Double.parseDouble(partsOfQues[0]);
		conversionResponse = partsOfQues[0] + " " + partsOfQues[1] + " equals";
	}

	public String getInput() {
		return conversionQues;
	}

	public String getFromConversion() {
		return fromConversion;
	}

	public String getToConversion() {
		return toConversion;
	}

	public String getConversionResponse() {
		return conversionResponse;
	}

	public double getQuantity() {
		return quantity;
	}

	public String getResponse() {
		return conversionResponse;
	}

	public String getCaptialized(String word) {
		word = word.toLowerCase();
		word = Character.toUpperCase(word.charAt(0)) + word.substring(1);

		int lengthOfWord = word.length();
		if ((word.charAt(lengthOfWord - 1)) != 's') {
			word = new StringBuffer(word).insert(lengthOfWord, 's').toString();
		}
		return word;
	}

	public String getLowerCase(String word) {
		return word.toLowerCase();
	}
}
