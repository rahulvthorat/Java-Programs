package com.dss;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Welcome";
		reverseString(str);

	}

	private static void reverseString(String str) {
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev += str.charAt(i);
		}

		System.out.println("String Reverse is:" + rev);

	}
}
