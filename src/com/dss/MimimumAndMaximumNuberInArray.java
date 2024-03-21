package com.dss;

public class MimimumAndMaximumNuberInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] result = findMinAndMax(arr);

		System.out.println("Minimum: " + result[0]);
		System.out.println("Maximum: " + result[1]);
	}

	private static int[] findMinAndMax(int[] arr) {
		
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int[] result = {min, max};
	        return result;
		
	}

}
