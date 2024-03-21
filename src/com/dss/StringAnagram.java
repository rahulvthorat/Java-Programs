package com.dss;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {

		String str1 = "Grab";
		String str2 = "Brag";
		
		anagram(str1, str2);

	}

	private static void anagram(String str1, String str2) {
		String lowerCase1 = str1.toLowerCase();
		String lowerCase2 = str2.toLowerCase();

		char[] charArray1 = lowerCase1.toCharArray();
		char[] charArray2 = lowerCase2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("String anagram");
		} else {
			System.out.println("Not anagram");
		}
	}

}
