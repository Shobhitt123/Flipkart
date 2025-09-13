package com.shobhit.javapractice;

public class BuyAndSellsStock {
//find max profit
	public static int maxProfit(int arr[]) {
		int maxprofit = 0;
		int minPrice = Integer.MAX_VALUE;
		for (int price : arr) {
			if (price < minPrice) {
				minPrice = price;
			} else if (price - minPrice > maxprofit) {
				maxprofit = price - minPrice;
			}
		}
		return maxprofit;

	}

	public static void main(String[] args) {

		int arr[] = {1,5,1,2,4,5};
		System.out.println(maxProfit(arr));
	}

}
