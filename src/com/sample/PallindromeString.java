package com.sample;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam1";

		String op = "";

		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {
			op += s.charAt(i);
		}
		
		System.out.println("op==" + op);
		
		if (s.equals(op)) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}
}