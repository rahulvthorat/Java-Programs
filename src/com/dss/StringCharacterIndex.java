package com.dss;

public class StringCharacterIndex {

	public static void main(String[] args) {

		String str = "Amay";
		stringIndex(str);

	}

	private static void stringIndex(String str) {

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			System.out.println(ch + "=" + i);
		}
	}

}
