package com.sample;

import java.util.HashMap;
import java.util.Map;

public class P12_RepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Great Responsibilty";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] charArray = str.toCharArray();
		
		for (Character ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
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
