package com.sample;

public class FirstLetterUpperOtherReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Bangalore is Capital of Karnataka"; // Berolagna Is Clatipa Of Kakatanra
		String reverse="";
		char ch[] = s.toCharArray();

		for (int i1 = 0; i1 < s.length(); i1++) {

			// If first character of a word is found
			if (i1 == 0 && ch[i1] != ' ' || ch[i1] != ' ' && ch[i1 - 1] == ' ') {

				// If it is in lower-case
				if (ch[i1] >= 'a' && ch[i1] <= 'z') {

					// Convert into Upper-case
					ch[i1] = (char) (ch[i1] - 'a' + 'A');
				}
			}
		}
		
		//System.out.println(ch);
		String s1 = String.valueOf(ch);
		System.out.println(s);
		
		//String str ;
		String[] word = s1.split("\\s");
		//String reversedString = "";

		/*
		 * for (int i = 0; i < word.length; i++) {
		 * 
		 * //System.out.println(word[i]); // String str = word[i]; String str = word[i];
		 * String reversedWord = "";
		 * 
		 * //System.out.println(str); for (int j = str.length() - 1; j > 0; j--) {
		 * reversedWord = reversedWord + str.charAt(j); } reversedString =
		 * reversedString + reversedWord + " "; //System.out.println(reversedWord); }
		 * System.out.println(reversedString);
		 */
		for (int i = 0; i < word.length; i++) {
			String str = word[i];
			String reversedString = word[i].charAt(0) + "";
			//System.out.println(reversedString);

			for (int j = str.length() - 1; j > 0; j--) {
				reversedString = reversedString + str.charAt(j);
			}
			reversedString = reversedString + " ";
			System.out.print(reversedString);
		}
	}
}
		

			
			


