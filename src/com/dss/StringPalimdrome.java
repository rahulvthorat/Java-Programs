package com.dss;

public class StringPalimdrome {

	public static void main(String[] args) {

		String str = "madam";
		checkPalimdromeString(str);

	}

	private static void checkPalimdromeString(String str) {
		String rev = "";
		String org = str;
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev += str.charAt(i);
		}

		if (org.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
