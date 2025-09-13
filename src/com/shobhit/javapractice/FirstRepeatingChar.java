package com.shobhit.javapractice;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingChar {

	public static char firstRepeatChar(char ch[]) {
		HashMap<Character,Integer>map = new HashMap<>();
		
		for(char chh : ch) {
			
			map.put(chh, map.getOrDefault(chh, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer>entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				return entry.getKey();
			}
		}
		
		
		return 0;
	}
	public static void main(String[] args) {
		char arr[] = { 'a', 'd','k', 'k', 'd', 'd', 'f', 'f', 'd', 'd', 'a', 's' };
		char result =  firstRepeatChar(arr);
		System.out.println(result);
	}
}
