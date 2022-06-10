package com.sample;

import java.util.HashMap;
import java.util.Map;

public class IndexNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks" ;//op: 5
		
		//char[] a = s.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] charArray = s.toCharArray();
		
		for (Character ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			//if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			//}
	}

}
}