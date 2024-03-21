package com.dss;

public class AddCharToString {

	public static void main(String[] args) {
		String str = "GeeksforGeek";
		addChar(str);

	}

	private static void addChar(String str) {

		char a = 's';

		 str = str + a;

		System.out.println(str);
	}

}
