package com.shobhit.javapractice;

import java.util.HashMap;
import java.util.Map; 

public class FirstNonRepetaingchar {
	// Function to find the first non-repeating character in an array
	public static char firstnonrepeat(char[] arr) {

		// Step 1: Create a HashMap to store frequency of each character
		HashMap<Character, Integer> map = new HashMap<>();

		// Step 2: Traverse the array and count character frequencies
		for (Character ch : arr) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		// Step 3: Traverse the map in insertion order
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				return entry.getKey();
			}
		}

		// Step 5: If no non-repeating character found
		System.out.println("no non repeating");

		return 0; // Returning 0 means no result
	}

	public static void main(String[] args) {

		// Input character array
		char arr[] = { 'a', 'd', 'd', 'd', 'f', 'f', 'd', 'd', 'a', 's' };

		// Print result
		System.out.println(firstnonrepeat(arr));
	}

}
