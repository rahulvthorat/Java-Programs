package com.dss;

public class StringCharDuplicateCount {

	public static void main(String[] args) {

		String str = "Automation";
		count(str);

	}

	private static void count(String str) {
		int count = 0;

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					System.out.println("Duplicate is:" + ch[i]);
					count++;
				}
			}
		}

		System.out.println("Count is:" + count);
	}

}
