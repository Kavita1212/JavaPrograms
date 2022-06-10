package com.sample;

public class FirstLetterUpperOtherReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Bangalore is Capital of Karnataka"; // Berolagna Is Clatipa Of Kakatanra

		char ch[] = s.toCharArray();
		//String strTemp="";

		String[] word = s.split("\\s");
		String reversedString = "";
		/*
		 * for (int i1 = 0; i1 < s.length(); i1++) {
		 * 
		 * // If first character of a word is found if (i1 == 0 && ch[i1] != ' ' ||
		 * ch[i1] != ' ' && ch[i1 - 1] == ' ') {
		 * 
		 * // If it is in lower-case if (ch[i1] >= 'a' && ch[i1] <= 'z') {
		 * 
		 * // Convert into Upper-case ch[i1] = (char) (ch[i1] - 'a' + 'A'); } } }
		 * System.out.println(ch);
		 */

		for (int i = 0; i < word.length; i++) {
			//String strTemp="";
			//System.out.println(word[i]);
			String str = word[i];
			//System.out.println(str.substring(0,1).toUpperCase());
			//strTemp = strTemp +str.substring(0,1).toUpperCase();
			//System.out.println("caps==" +strTemp);
			// if(word[i].toUpperCase())
			String reversedWord = "";

			/*
			 * for (int j = 0; j < str.length(); j++) { //reversedWord = reversedWord +
			 * str.charAt(j); if(str.charAt(j))
			 * 
			 * }
			 */

			for (int j = str.length() - 1; j > 0; j--) {
				//reversedWord = strTemp+reversedWord + str.charAt(j);
				reversedWord = str.substring(0,1).toUpperCase()+reversedWord + str.charAt(j);
			}
			
			reversedString =  reversedString + reversedWord + " ";
			// System.out.println(reversedWord);
		}
		
		
		
		System.out.println(reversedString);

	}
}
