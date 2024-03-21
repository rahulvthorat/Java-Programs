package com.dss;

import java.util.Objects;
import java.util.Scanner;

public class PalimdromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		checkPalimdromeNumber(num);

	}

	private static void checkPalimdromeNumber(int num) {
		int rev = 0;
		int org = num;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (Objects.equals(org, rev)) {
			System.out.println("Palimdrome");
		} else {
			System.out.println("Not palimdrome");
		}

	}

}
