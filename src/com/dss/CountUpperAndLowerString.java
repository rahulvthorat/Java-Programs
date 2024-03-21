package com.dss;

public class CountUpperAndLowerString {

	public static void main(String[] args) {

		String str = "Automation";
		countupperandLowerString(str);

	}

	private static void countupperandLowerString(String str) {
		int upperCount = 0;
		int lowerCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 65 && ch <= 95) {
				upperCount++;
			} else {
				lowerCount++;
			}
		}

		System.out.println("upper String:" + upperCount);
		System.out.println("lower String:" + lowerCount);
	}

}
