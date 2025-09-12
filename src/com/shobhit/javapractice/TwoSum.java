package com.shobhit.javapractice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static void main(String args[]) {
		// Input array
		int arr[] = {7,2,3,4,5,6,1};
		
		 // Target sum to find
		int target = 9;
		
		// Call findTwoSum() and convert the result into string
		String s = Arrays.toString(findTwoSum(arr, target));
		System.out.println(s);
	}
	
	// Method to find two numbers that add up to the target
	public static int[] findTwoSum(int arr[], int target) {
		
		// HashMap to store numbers and their indexes
		HashMap<Integer, Integer>map = new HashMap<>();
		
		 // Traverse through the array
		for(int i = 0; i<arr.length; i++) {
			
			// Calculate the second number needed to form the target
			int secondNum = target - arr[i];
			
			// Check if the second number already exists in the map
			if(map.containsKey(secondNum)) {
				// If found, return the pair (value and index)
				return new int [] {arr[i], i};
			}
			
			// Otherwise, store the current number with its index
			map.put(arr[i], i);
		}
		// Return empty array if no pair found
		return new int [] {};
	}
}
