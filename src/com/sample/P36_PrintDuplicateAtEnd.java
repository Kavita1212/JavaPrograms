package com.sample;

public class P36_PrintDuplicateAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 4, 2, 8, 7, 2, 2 }; // 1,4,8,7,2,2,2,2
		int b[] = new int[a.length];

		int count = 0;

		for (int num : a) {
			if (num != 2) {
				b[count] = num;
				count++;
			}
		}
		while (count < a.length)
			b[count++] = 2;

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}