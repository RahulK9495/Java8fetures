package com.prowings.Javapractise;

public class fibonacciSeries {
	public static void main(String[] args) {

		getFibonacciSeries(10);

	}

	public static void getFibonacciSeries(int count) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 0; i <= count; i++) {
			System.out.print(a + ",");
			a = b;
			b = c;
			c = a + b;
		}
	}

}
