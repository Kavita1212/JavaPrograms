package com.sample;

import java.util.HashMap;
import java.util.Map;

public class P53_FirstRepeatingCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		//String s = "malayalamyfd";

		//int index;

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
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			//if (map.get(ch1) == 1) {
			if (map.get(ch1) > 1) {
				//index = i;
				System.out.println("===============");
				System.out.println(ch1);
				break;
			}
		}
	}
}