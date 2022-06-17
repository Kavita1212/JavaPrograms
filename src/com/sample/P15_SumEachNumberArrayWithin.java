package com.sample;

import java.util.ArrayList;

public class P15_SumEachNumberArrayWithin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 32, 4, 21, 45, 1 };

		ArrayList<Integer> al = new ArrayList<Integer>();

		int temp;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			while (a[i] > 0) {
				temp = a[i] % 10;
				sum += temp;
				a[i] = a[i] / 10;
			}
			al.add(sum);
		}
		System.out.println("al==" + al);
	}

}
