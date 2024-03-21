package com.dss;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 4, 5, };
		findDuplicates(arr);

	}

	private static void findDuplicates(int[] arr) {
		boolean foundDuplicate = false;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("Found duplicate:" + arr[i]);
					foundDuplicate = true;
					break;
				}
			}
		}
		if (!foundDuplicate) {
			System.out.println("No duplicates found.");
		}

	}

}
