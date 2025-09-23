package com.shobhit.javapractice;

import java.util.Arrays;

public class AddTwoArrays {
	public static void main(String[] args){
	    int arr[] = {1,2,3,4,5};
	    int arr1[] = {1,2,3,4};
	    
	    //my precondition is length must be same
	    if(arr.length != arr1.length){
	        System.out.println("length must be same");
	        return;
	    }
	    
	    int result[] = new int[arr.length];
	    for(int i =0; i<arr.length; i++){
	        result[i] = arr[i] + arr1[i];
	    }
	    System.out.println(Arrays.toString(result));
	} 

}
