package com.dss;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		countNumberOfDigit(num);

	}

	private static void countNumberOfDigit(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}

		System.out.println("number of digit is:" + count);
	}

}
