package com.leetcode.explore.primaryalgorithm;

public class Arr2 {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		 int buy = 0;
         int sell = 0;
         for(int i=1;prices!=null &&i<prices.length;i++){
             if(prices[i] >= prices[i-1]) {
                 buy = buy+ ( prices[i] - prices[i-1]);
             }
         } // TODO Auto-generated method stub
         	System.out.println(buy);
	}

}
