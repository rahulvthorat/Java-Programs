package com.dss;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSortArrayInBuildMethod {

	public static void main(String[] args) {

		Integer[] arr = { 20, 50, 40, 10, 30 };
		sortReverse(arr);

	}

	private static void sortReverse(Integer[] arr) {
		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println("Reverse sort Array:" + Arrays.toString(arr));

	}

}
