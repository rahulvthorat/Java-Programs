package com.dss;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {

		printNumber(1);

	}

	private static void printNumber(int N) {

		if (N <= 10) {
			System.out.println(N);
			N++;
			printNumber(N);
		}
	}

}
