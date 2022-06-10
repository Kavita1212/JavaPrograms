package com.sample;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2345;

		int reverse = 0, remainder;

		while (n > 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		System.out.println("reverse==" + reverse);
	}
}