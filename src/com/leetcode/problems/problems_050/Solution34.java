package com.leetcode.problems.problems_050;

import java.util.Arrays;

public class Solution34 {
	
	public static void main(String[] args) {
		 int[] arr = {5,7,7,8,8,10};
	     System.out.println( Arrays.toString(searchRange(arr,11)) );
	     
	}
	
	public static int[] searchRange(int[] nums, int target) {
		int temp []= {-1,-1}; 
		int l = 0;
		int h  = nums.length-1;
		int mid = 0;
		while(l<=h) {
			mid = l+ ((h-l)>>2) ;
			if(nums[mid]>target) {
				h = mid-1;
			}else if(nums[mid]<target){
				l = mid+1;
			}else {
//				return mid;
				//相等表示找到了继续用二分法查找第一个这个元素 和 最后一个这个元素 
				if(mid-1<l || nums[mid-1] != target ) {
					temp[0] = mid;
					break;
				}else {
					h = mid-1;
				}
			}
		}
		l = 0;
		h  = nums.length-1;
		while(l<=h) {
			mid = l+ ((h-l)>>2) ;
			if(nums[mid]>target) {
				h = mid-1;
			}else if(nums[mid]<target){
				l = mid+1;
			}else {
//				return mid;
				//相等表示找到了继续用二分法查找第一个这个元素 和 最后一个这个元素 
				if(mid+1>h || nums[mid+1] != target ) {
					temp[1] = mid;
					break;
				}else {
					l = mid+1;
				}
			}
		}
		
		return temp;
	}
	
	public static int binarySearch(int[] nums, int target) {
		int temp []= new int[2]; 
		int l = 0;
		int h  = nums.length-1;
		int mid = 0;
		while(l<=h) {
			mid = l+ ((h-l)>>2) ;
			if(nums[mid]>target) {
				h = mid-1;
			}else if(nums[mid]<target){
				l = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
