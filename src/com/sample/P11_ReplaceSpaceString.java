package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class P11_ReplaceSpaceString {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a tester";

		
		String[] word = s.split("\\s");
		String str = "" ;
		for (int i = 0; i < word.length; i++) {
			 str += word[i];
			}
		System.out.println("str=="+str);
	}
}