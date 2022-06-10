package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReplaceSpaceString {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a tester";
		//ArrayList<String> op = new ArrayList<>();
		/*
		 * String []a = str.split(" "); for (int i = 0; i < a.length; i++) {
		 * //System.out.println(a[i]); // op.add(a[i]); //System.out.println(op); }
		 */
		/*
		 * Stack<String> myStack = new Stack<>(); StringTokenizer st = new
		 * StringTokenizer(s); while (st.hasMoreTokens()) {
		 * myStack.push(st.nextToken()); } System.out.println(myStack);
		 * System.out.print('"' + s + '"' + " backwards by word is:\n\t\""); while
		 * (!myStack.empty()) { System.out.print(myStack.pop()); System.out.print(' ');
		 * }
		 * 
		 * System.out.println('"');
		 */
		
		String[] word = s.split("\\s");
		String str = "" ;
		for (int i = 0; i < word.length; i++) {
			 str += word[i];
			//System.out.println("str=="+str);
		}
		System.out.println("str=="+str);
	}
}