package com.dss;

public class VowelCounts {

	public static void main(String[] args) {

		String str = "Automation Testing";
		vowelCount(str);

	}

	private static void vowelCount(String str) {

		int count = 0;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}

		}

		System.out.println("Vowel count is:" + count);
	}
}
