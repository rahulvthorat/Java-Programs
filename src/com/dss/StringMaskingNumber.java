package com.dss;

public class StringMaskingNumber {

	public static void main(String[] args) {

		String maskNumber = "123456789";
		maskNumber(maskNumber);

	}

	private static void maskNumber(String maskNumber) {
		if (maskNumber.length() > 5) {
			System.out.println(maskNumber.replaceAll(".(?=.{5})", "#"));
		} else if (maskNumber.equalsIgnoreCase(" ")) {
			System.out.println(maskNumber);
		} else {
			System.out.println(maskNumber);
		}
	}
}
