package com.dss;

public class GetCharIndexFormString {

	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		index(str, 5);

	}

	private static void index(String str, int index) {
		char ch = str.charAt(index);

		System.out.println("Character from " + str + " at index " + index + " is " + ch);
	}

}
