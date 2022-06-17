package com.sample;

public class P1_PrimeNumber {

	public static void main(String args[]) {

		int n = 6, i;
		boolean flag = false;

		int m = n / 2;

		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Prime Numer");
		} else {
			System.out.println("Not Prime Numer");
		}

	}

}
