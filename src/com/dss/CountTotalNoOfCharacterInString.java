package com.dss;

public class CountTotalNoOfCharacterInString {

	public static void main(String[] args) {

		String str = "Automation";
		counts(str);

	}

	private static void counts(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != 0) {

				count++;

			}
		}

		System.out.println("Counts:" + count);
	}

}
