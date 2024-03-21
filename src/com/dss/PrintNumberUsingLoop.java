package com.dss;

public class PrintNumberUsingLoop {

	public static void main(String[] args) {

		printNumber(10);
	}
	
	private static void printNumber(int N) {
		int i=1;
		while(i<=N) {
			System.out.println("Print Number is:"+i);
			i++;
		}
	}

}
