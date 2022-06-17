package com.sample;

public class P30_CountCapitalSmallLettersString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s ="HellO WOrld";
		String s ="Java";
		String lowercase="";
		String uppercase="";
		
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			//System.out.println(ch[i]);
			if (ch[i] >= 97 && ch[i] <= 122) // ascii value in between 97 and 122 is a to z
			{
				lowercase += ch[i]; // adding only lowercase
			}
			else if(ch[i] >= 65 && ch[i] <= 91) { // ascii value in between 65 and 91 is a to Z
				uppercase += ch[i]; // adding only uppercase
			}
			
		}
		/*
		 * System.out.println("output=="+output +" = " +output.length());
		 * System.out.println("output1=="+output1 +" = " +output1.length());
		 */
		System.out.println(uppercase.length() +" , " +lowercase.length());
		
		/*
		 * for (int i = 0; i < ch.length; i++) { //System.out.println(ch[i]); if (ch[i]
		 * >= 65 && ch[i] <= 91) // ascii value in between 65 and 91 is a to Z { output1
		 * += ch[i]; // adding only uppercase }
		 * 
		 * } System.out.println("output1=="+output1 +" = " +output1.length());
		 */
	}

}
