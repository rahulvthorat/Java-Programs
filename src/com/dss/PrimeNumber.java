package com.dss;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		primeNumber();

	}

	private static void primeNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		sc.close();

		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
	}

}
