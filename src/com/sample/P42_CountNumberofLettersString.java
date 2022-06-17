package com.sample;

public class P42_CountNumberofLettersString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";

		// char[] ch = a.toCharArray();
		int count = 0;

		for (int i = 0; i < a.length(); i++) {
			count++;
		}
		System.out.println(count);
	}
	// System.out.println(a.length());

}
