package com.dss;

public class IterateCharInString {

	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		iterate(str);

	}

	private static void iterate(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			System.out.print(" ");
		}
	}

}
