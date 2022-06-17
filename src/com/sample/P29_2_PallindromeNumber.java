package com.sample;

public class P29_2_PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1211;
		int temp = n;
		int reverse = 0, remainder;

		while (n > 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		System.out.println("reverse==" + reverse);
		if (temp == reverse) {
			System.out.println("Pallindrome Number");
		} else {
			System.out.println("Not Pallindrome Number");
		}
	}
}
