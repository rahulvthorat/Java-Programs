package com.dss;

public class SwapPairsOfCharInString {

	public static void main(String[] args) {
		String str = "java";
		swap(str);

	}

	private static void swap(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length - 1; i += 2) {
			char temp = ch[i];
			ch[i] = ch[i + 1];
			ch[i + 1] = temp;
		}

		System.out.println(ch);
	}

}
