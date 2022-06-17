package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P38_DivideArrayAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 2, 1, 0, 4, 6, 7, 8, 5, 9 }; //4 0 1 2 3 9 5 8 7 6
		
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		for (int i = 0; i < a.length/2; i++) {
			System.out.println(a[i]);
			al.add(a[i]);
			//Collections.reverse(al);
			
		}
		Collections.reverse(al);
		System.out.println(al);
	
	
	for (int j = a.length/2; j < a.length; j++) {
		System.out.println(a[j]);
		al1.add(a[j]);
		//Collections.reverse(al);
		
	}
	Collections.reverse(al1);
	System.out.println(al1);
	al.addAll(al1);
	
	System.out.println("=============");
	System.out.println("Final List=============" + al);
}
}