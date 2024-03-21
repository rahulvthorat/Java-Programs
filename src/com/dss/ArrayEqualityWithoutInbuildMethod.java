package com.dss;

public class ArrayEqualityWithoutInbuildMethod {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };

		boolean equals = arrayEquals(a, b);

		if (equals) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}

	private static boolean arrayEquals(int[] arr1, int[] arr2) {

		if (arr1.length != arr2.length) {
			return false;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
