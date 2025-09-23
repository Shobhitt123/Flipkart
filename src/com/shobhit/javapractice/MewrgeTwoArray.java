package com.shobhit.javapractice;

import java.util.Arrays;

public class MewrgeTwoArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int arr1[] = { 1, 2, 3, 6, 5 };

		int merged[] = new int[arr.length + arr1.length];

		for (int i = 0; i < arr.length; i++) {
			merged[i] = arr[i];
		}

		int mi = arr1.length;

		for (int i = 0; i < arr1.length; i++) {
			merged[mi] = arr1[i];
			mi++;
		}
		System.out.println(Arrays.toString(merged));
	}
}
