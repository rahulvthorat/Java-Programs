package com.dss;

public class ReverseEachWorldInString {

	public static void main(String[] args) {

		String str = "Hello World";
		reverseStringEach(str);

	}

	private static void reverseStringEach(String str) {

		String[] split = str.split("\\s");
		String reverse = "";

		for (String w : split) {

			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverse = reverse + sb.toString() + ' ';

		}

		System.out.println(reverse);
	}

}
