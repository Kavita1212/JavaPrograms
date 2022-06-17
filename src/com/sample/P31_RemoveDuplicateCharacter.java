package com.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P31_RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Java";
		
		char[] a =s.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (Character ch : a) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
			
		}
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			if(m.getValue()==1) 
			//System.out.println(m.getKey() +" :" + m.getValue());
			System.out.print(m.getKey());
		}
		
	}

}
