package com.sample;

public class P41_RetriveLowerCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "Hello World";
		//String s = "HelLo WoRld";
		String s = "Hi Bye";
		String output = "";

		char[] findlower = s.toCharArray();
		
		for (int i = 0; i < findlower.length; i++) {
			if (findlower[i] >= 97 && findlower[i] <= 122) // ascii value in between 97 and 122 is a to z
			{
				output += findlower[i]; // adding only lowercase
			}
		}
		System.out.println("Answer : " + output);
	}
}
