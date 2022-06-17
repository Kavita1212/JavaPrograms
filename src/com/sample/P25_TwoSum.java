package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P25_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 7, 9, 11, 15, 1, 18 }; // target - 17 {0,4}

		int target = 17;

		int index = 0;

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			m.put(a[i], i);
		}
		System.out.println(m);

		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			int rem = target - num;
			// System.out.println("rem=="+rem);
			if (m.containsKey(rem)) {
				index = m.get(rem);
				System.out.println("num=" + num + " index==" + m.get(rem));

				// System.out.println("index=="+index);

			}

		}

	}
}