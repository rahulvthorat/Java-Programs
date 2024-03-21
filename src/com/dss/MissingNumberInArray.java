package com.dss;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		findMissingNumber(arr);

	}

	private static void findMissingNumber(int[] arr) {
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}

		for (int i = 1; i <= 6; i++) {
			sum2 += i;
		}

		System.out.println(sum2 - sum1);

	}
}
