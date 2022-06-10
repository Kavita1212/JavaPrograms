package com.sample;

public class Test {

	public static void main(String[] args) {
		String s = "Bangalore is Capital of Karnataka"; // Berolagna Is Clatipa Of Kakatanra
		String reverse = "";
		char ch[] = s.toCharArray();

		for (int i1 = 0; i1 < s.length(); i1++) {

			if (i1 == 0 && ch[i1] != ' ' || ch[i1] != ' ' && ch[i1 - 1] == ' ') {

				if (ch[i1] >= 'a' && ch[i1] <= 'z') {

					ch[i1] = (char) (ch[i1] - 'a' + 'A');
				}
			}
		}
		String s1 = String.valueOf(ch);
		System.out.println(s);
		String[] word = s1.split("\\s");
		// String reversedString = "";

		for (int i = 0; i < word.length; i++) {
			String str = word[i];
			String reversedString = word[i].charAt(0) + "";

			for (int j = str.length() - 1; j > 0; j--) {
				reversedString = reversedString + str.charAt(j);
			}
			reversedString = reversedString + " ";
			System.out.print(reversedString);
		}
		
	}
}