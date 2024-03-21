package com.dss;

public class Swapping {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before swapping: " + a + " " + b);

		swap(a, b);
	}

	private static void swap(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping: " + a + " " + b);
	}

}
