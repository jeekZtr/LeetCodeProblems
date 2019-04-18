package com.leetcode.explore.primaryalgorithm;

import java.util.Arrays;

public class SearchAndOrder {
	/**
	 *  合并两个有序数组

		给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
		
		说明:
		
		    初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
		    你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
		
		示例:
		
		输入:
		nums1 = [1,2,3,0,0,0], m = 3
		nums2 = [2,5,6],       n = 3
		
		输出: [1,2,2,3,5,6]


	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i=nums1.length;i>0;i--) {
			if( m>=1 && n>=1 && nums1[m-1] > nums2[n-1]) {
				nums1[i-1] = nums1[m-1]; 
				m--;
			}else if( m>=1 && n>=1 && nums1[m-1] <= nums2[n-1] ) {
				nums1[i-1] = nums2[n-1]; 
				n--;
			}else if( m < 1 && n>=1){
				nums1[i-1] = nums2[n-1]; 
				n--;
			}else if( m >= 1 && n<1){
				nums1[i-1] = nums1[m-1]; 
				m--;
			}
		}
	}
	
	public static void main(String args[]) {
		int[] nums1 = {4,3,2,0};
		int[] nums2 = {2};
		
		 merge(nums1,3,nums2,1);
		 System.out.println(Arrays.toString(nums1));
		
	}
}
