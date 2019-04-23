package com.leetcode.explore.primaryalgorithm;

import java.util.Arrays;

public class SearchAndOrder2 {
	/**
	  *         第一个错误的版本
	  *         
		你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
		假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
		你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
		
		示例:
		
		给定 n = 5，并且 version = 4 是第一个错误的版本。
		
		调用 isBadVersion(3) -> false
		调用 isBadVersion(5) -> true
		调用 isBadVersion(4) -> true
		
		所以，4 是第一个错误的版本。
		
		
		这里直接使用min <= max的二分模板，
		因为我们其实要找的是好和坏的分界点，
		即这个点既不是好也不是坏，所以是找不到的，
		
		按照模板的特点，最后退出循环时，max指向小于目标的点，min指向大于目标的点，
		这里第一个坏的version较大，所以返回min
	 */
	public static  int firstBadVersion(int n) {
		
		int mid=0,max = n,min =1 ;
		while( max > min) {
			mid = min +(min+max)/2;
			if( isBadVersion(mid) ) {
				max = mid -1; 
			}else {
				min = mid + 1; 
			}
		}
		
		return min;
    }
	
	public static void main(String args[]) {
		int[] nums1 = {4,3,2,0};
		int[] nums2 = {2};
		
		 System.out.println(Arrays.toString(nums1));
		
	}
	
	public static boolean isBadVersion(int version) {
		 return false;
	 }
}
