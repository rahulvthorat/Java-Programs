package com.dss;

import java.util.Scanner;

public class ReverseNumberInBuildMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		reverseNumber(num);
	}

	private static void reverseNumber(int num) {

		StringBuilder sb = new StringBuilder(String.valueOf(num));
		StringBuilder reverse = sb.reverse();
		System.out.println("Reverse number is:" + reverse);
	}
}
