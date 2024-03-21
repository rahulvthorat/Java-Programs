package com.dss;

import java.util.Arrays;

public class ReverseSortArray {

	public static void main(String[] args) {

		int[] arr = { 2, 9, 1, 5, 6, 3, 8 };
		reverseSortArray(arr);

	}

	private static void reverseSortArray(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		System.out.println("Sorted Array in Reverse Order:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
