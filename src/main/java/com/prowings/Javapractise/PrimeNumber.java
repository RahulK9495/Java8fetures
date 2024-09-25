package com.prowings.Javapractise;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println(isPrime(83));

	}

	public static boolean isPrime(int n) {
		if (n <= 2)
			return false;

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}

		return true;

	}

}
