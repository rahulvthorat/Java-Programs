package com.dss;

import java.util.Arrays;

public class ArraysEqualInbuildMethod {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };

		compareArrays(a, b);

	}

	private static boolean compareArrays(int[] arr1, int[] arr2) {

		
		boolean equals = Arrays.equals(arr1, arr2);
		if (equals) {
			System.out.println("Array are Equals");
		} else {
			System.out.println("Array are not Equals");
		}
		return equals;
	}
}
