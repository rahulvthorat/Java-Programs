package com.dss;

import java.util.Random;
import java.util.Scanner;

public class GenrateRandomNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		sc.close();
		genrateRandomNumber(num);
		
	}

	private static void genrateRandomNumber(int num) {
		Random rnd = new Random();
		int number = rnd.nextInt(num+1);

		System.out.println("Random number is:" + number);
	}
}
