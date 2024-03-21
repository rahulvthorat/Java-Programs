package com.dss;

import java.util.Arrays;

public class BubleSortInBuildMethod {

	public static void main(String[] args) {

		int[] arr = { 10, 50, 40, 30, 20 };
		sortArray(arr);

	}

	private static void sortArray(int[] arr) {

		Arrays.sort(arr);

		System.out.println("after sorting:" + Arrays.toString(arr));

	}

}
