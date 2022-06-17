package com.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P46_TrackDuplicate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s = "aaabccd";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] charArray = s.toCharArray();
		
		for (Character ch : charArray) {
			if (map.containsKey(ch)) {
				//map.put(ch, map.get(ch) + 1);
				throw new Exception();
			} else {
				map.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}

		}
	}

}
