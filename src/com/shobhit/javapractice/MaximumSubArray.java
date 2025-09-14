package com.shobhit.javapractice;

public class MaximumSubArray {
	public static int FindMaxSubArray(int arr[]) {
		
		int currentSum = 0;
		int  maxSum = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			
			currentSum += arr[i];
			if(currentSum>maxSum) {
				maxSum = currentSum;
				
			}
			
			if(currentSum<0) {
				currentSum = 0;
			}
		}
		return maxSum;
		
	}
	
	public static void main(String[] args) {
		int arr[] =  {-1,-2,-2,2,5,1,-1};
		System.out.println(FindMaxSubArray(arr));
	}
}
