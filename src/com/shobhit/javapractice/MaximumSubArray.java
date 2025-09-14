package com.shobhit.javapractice;

public class MaximumSubArray {
	 // Method to find the maximum subarray sum (Kadane's Algorithm)
	public static int FindMaxSubArray(int arr[]) {

		int currentSum = 0; // Stores current running sum
		int maxSum = arr[0]; // Stores maximum sum found so far

		// Loop through each element in the array
		for (int i = 0; i < arr.length; i++) {

			currentSum += arr[i];// Add current element to runni ng sum
			// Update maxSum if current sum is greater
			if (currentSum > maxSum) {
				maxSum = currentSum;

			}

			// If current sum becomes negative, reset it to 0
			// (because a negative sum won't help in forming max subarray)
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return maxSum; // Return the maximum subarray sum

	}

	public static void main(String[] args) {
		int arr[] = { -1, -2, -2, 2, 5, 1, -1 };
		System.out.println(FindMaxSubArray(arr));
	}
}
