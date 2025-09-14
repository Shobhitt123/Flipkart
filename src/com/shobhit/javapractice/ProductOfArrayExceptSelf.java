package com.shobhit.javapractice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,1};
		System.out.println(Arrays.toString(productExceptSelf(arr)));
		
	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int prifix[] = new int[n];
		int suffix[] = new int[n];
		int ans[] = new int[n];

		prifix[0] = 1;
		for (int i = 1; i < n; i++) {
			prifix[i] = prifix[i - 1] * nums[i - 1];
		}

		suffix[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			suffix[i] = suffix[i + 1] * nums[i + 1];
		}

		for (int i = 0; i < n; i++) {
			ans[i] = prifix[i] * suffix[i];
		}
		return ans;
	}

}
