package com.dss;

import java.util.Scanner;

public class FibnacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		fibnacciSeries(num);

	}

	private static void fibnacciSeries(int num) {
		int term1 = 1;
		int term2 = 1;
		int sum = 0;

		System.out.print(term1 + " " + term2);

		for (int i = 2; i <= num; i++) {

			sum = term1 + term2;
			System.out.print(" " + sum);
			term1 = term2;
			term2 = sum;
		}
	}

}
