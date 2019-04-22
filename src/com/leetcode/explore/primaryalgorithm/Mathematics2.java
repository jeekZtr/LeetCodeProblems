package com.leetcode.explore.primaryalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mathematics2 {
	/**
	 *         计数质数

		统计所有小于非负整数 n 的质数的数量。
		
		示例:
		
		输入: 10
		输出: 4
		解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。


	 */
	 public static int countPrimes(int n) {
	        int sum = 0;
	        boolean[] flag = new boolean[n+1];
	        for(int i=0;i<=n;i++) {
	        	flag[i] = true;
	        }
	        for(int i=2;i<n;i++) {
	        	if( flag[i ]) {
	        		for(int j=i+i;j<n+1;j+=i) {
	        			flag[j] = false;
	        		}
	        		sum++;
	        	}
	        }
	        return sum;
	 }
	 
	 public static void main(String args[]) {
		 System.out.println(countPrimes(2));
	 }
}
