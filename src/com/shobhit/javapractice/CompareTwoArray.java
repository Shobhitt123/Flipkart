package com.shobhit.javapractice;

public class CompareTwoArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1,2};
        int arr1[] = {1,2,3,2,1,2};
        
        //check both same or not
        boolean istrue = true;
        if(arr.length != arr1.length){
            istrue = false;
        }
        else{
            for(int i =0; i<arr.length; i++){
                if(arr[i] != arr1[i]){
                    istrue = false;
                    break;
                }
            }
        }
        System.out.println(istrue);
        
     }
}
