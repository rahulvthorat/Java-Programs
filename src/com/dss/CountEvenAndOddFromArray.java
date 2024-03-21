package com.dss;

public class CountEvenAndOddFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] count = countEvenAndOdd(arr);

		System.out.println("Even count:" + count[0]);
		System.out.println("Odd count:" + count[1]);
	}

	private static int[] countEvenAndOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		int[] counts = { evenCount, oddCount };
		return counts;

	}

}
