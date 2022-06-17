package com.sample;

public class P2_ReverseString {

	public static void main(String args[]) {
		String s = "Bangalore";

		int len = s.length();

		String output = "";

		for (int i = len - 1; i >= 0; i--) {
			output = output + s.charAt(i);

		}
		System.out.println(output);
	}
}
