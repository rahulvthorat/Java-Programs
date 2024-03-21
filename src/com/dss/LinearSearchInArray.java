package com.dss;

public class LinearSearchInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int searchE = 5;

		boolean found = linearSearch(arr, searchE);

		if (found) {
			System.out.println("Element found: " + searchE);
		} else {
			System.out.println("Element not found: " + searchE);
		}

	}

	private static boolean linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				return true;
			}
		}
		return false;
	}

}
