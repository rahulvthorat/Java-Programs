package com.dss;

public class SumOfArrays {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = calculateSum(arr);

		System.out.println("Sum of array:" + sum);
	}

	private static int calculateSum(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		return sum;
	}

}
