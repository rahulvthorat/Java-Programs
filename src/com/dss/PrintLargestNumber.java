package com.dss;

import java.util.Scanner;

public class PrintLargestNumber {

	public static void main(String[] args) {

		largestNumber(0);

	}

	private static void largestNumber(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		if (a > b && a > c) {
			System.out.println("A is largest number:" + a);
		}
		if (b > c) {
			System.out.println("B is largest number:" + b);
		} else {
			System.out.println("C is largest number:" + c);
		}

	}

}
