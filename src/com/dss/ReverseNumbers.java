package com.dss;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {

		reversNumber();

	}

	private static void reversNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		sc.close();
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Reversed Number is:" + rev);
	}
}
