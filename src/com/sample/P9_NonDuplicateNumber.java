package com.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P9_NonDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,1,2,1,3,1,2,4,2,6,7};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//char[] charArray = s.toCharArray();
		
		for (Integer num : a) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (!(entry.getValue() > 1)) {
				//System.out.println(entry.getKey() + " : " + entry.getValue());
				System.out.println(entry.getKey());
			}

		}

	}

}
