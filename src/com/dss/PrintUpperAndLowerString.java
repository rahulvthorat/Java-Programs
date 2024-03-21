package com.dss;

public class PrintUpperAndLowerString {

	public static void main(String[] args) {
		String str = "Welcome to india";
		printUpperandLowerString(str);

	}

	private static void printUpperandLowerString(String str) {
		String upper = "";
		String lower = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper = upper + ch;
			} else {
				lower = lower + ch;
			}
		}

		System.out.println("Uppers:" + upper);
		System.out.println("Lowers:" + lower);

	}

}
