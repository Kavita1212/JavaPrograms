package com.sample;

public class ReverseWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is Kavita"; //sihT si ativaK

		String[] word = s.split("\\s");
		String reversedString = "";

		for (int i = 0; i < word.length; i++) {
			
			//System.out.println(word[i]);
			String str = word[i];
			String reversedWord = "";
			
			//System.out.println(str);
			for (int j = str.length() - 1; j >= 0; j--) {
				reversedWord = reversedWord + str.charAt(j);
			}
			reversedString = reversedString + reversedWord + " ";
			//System.out.println(reversedWord);
		}
		System.out.println(reversedString);
	}
}
