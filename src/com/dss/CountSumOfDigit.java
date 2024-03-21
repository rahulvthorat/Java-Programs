package com.dss;

import java.util.Scanner;

public class CountSumOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		countSumOfDigit(num);

	}

	private static void countSumOfDigit(int num) {
		int sum = 0;

		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("sum of digit is:" + sum);
	}
}
