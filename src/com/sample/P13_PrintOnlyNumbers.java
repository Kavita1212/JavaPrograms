package com.sample;

public class P13_PrintOnlyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1589rrttt677";

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 48 && ch[i]  <= 57) {

				System.out.print(ch[i]);

			} 
		}

	}
}