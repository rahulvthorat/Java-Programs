package com.dss;

public class PrintEvenAndFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printEvenAndOdd(arr);

	}

	private static void printEvenAndOdd(int[] arr) {
		System.out.println("Even:");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

		System.out.println("Odd:");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
