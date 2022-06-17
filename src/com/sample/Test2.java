package com.sample;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "all2habaa2d";
		
		String s1 = " ";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == 'a' && ch[i]<='z' ||ch[i]>='A' && ch[i]<='Z') {
				s1 = s1+ch[i];
			}
			
		}
		System.out.println(s1);
		
	}

}
