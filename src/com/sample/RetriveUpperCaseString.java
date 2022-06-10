package com.sample;

public class RetriveUpperCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "Hello World";
		String s = "HelLo WoRld";
		String output = "";

		char[] findupper = s.toCharArray();
		
		for (int i = 0; i < findupper.length; i++) {
			if (findupper[i] >= 65 && findupper[i] <= 91) // ascii value in between 65 and 91 is A to Z
			{
				output += findupper[i]; // adding only uppercase
			}
		}
		System.out.println("Answer : " + output);
	}
}
