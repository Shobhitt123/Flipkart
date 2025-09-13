package com.shobhit.javapractice;

import java.util.HashMap;


public class FirstRepeatingCharBack {



		public static char firstRepeatChar(char ch[]) {
			HashMap<Character, Integer> map = new HashMap<>();

			for (char chh : ch) {
				if (map.containsKey(chh)) {
					return chh;
				}
				map.put(chh, map.getOrDefault(chh, 0) + 1);
			}

			return 0;
		}

		public static void main(String[] args) {
			char arr[] = { 'a', 'd', 'k', 'k', 'd', 'd', 'f', 'f', 'd', 'd', 'a', 's' };
			char result = firstRepeatChar(arr);
			System.out.println(result);
		}
	

}
