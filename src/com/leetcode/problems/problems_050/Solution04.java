package com.leetcode.problems.problems_050;

import java.util.Arrays;

/*
 * 	寻找两个有序数组的中位数
给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

你可以假设 nums1 和 nums2 不会同时为空。

示例 1:
nums1 = [1, 3]
nums2 = [2]

则中位数是 2.0

示例 2:
nums1 = [1, 2]
nums2 = [3, 4]

则中位数是 (2 + 3)/2 = 2.5


 */
public class Solution04 {

	public static void main(String[] args) {
		int[] nums1 = {1, 2};
		int[] nums2 = {3};
		findMedianSortedArrays(nums1,null);
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double d = 0.0;
        int m =0 ,n = 0;
        if(nums1 != null ) {
        	m = nums1.length;
        }
        if(nums2 != null) {
        	n = nums2.length;
        }
        int[] temp = new int[m+n];
        int x=0,y=0,index=0;
        System.out.println("m--"+m+" , n--" + n);
        while(x<m || y<n) {
            System.out.println("x--"+x+" , y--" + y);
        	if(nums2!=null && nums1!=null && nums1.length>0 && nums2.length>0 && x<m && y<n && nums1[x] <= nums2[y] ) {
        		temp[index] = nums1[x];
        		x++;
        		System.out.println("1");
        	}else if(nums2!=null && nums1!=null && nums1.length>0 && nums2.length>0 && x<m && y<n  && nums1[x] >= nums2[y] ){
        		temp[index] = nums2[y];
        		y++;
        		System.out.println("2");
        	}else if( (nums2==null|| y>=n-1 )&& nums1!=null && nums1.length>0 && x<m   ){
        	    System.out.println("3");
        		temp[index] = nums1[x];
        		x++;
        	}else if( nums2!=null && (nums1 ==null || x>=m-1) && nums2.length>0  && y<n ){
        		temp[index] = nums2[y];
        		y++;
        		System.out.println("4");
        	}
        	
        	//System.out.println("index--"+index +" , x--"+x+" , y--" + y);
        	index++;
        }
        
//        System.out.println(Arrays.toString(temp));
        
        double mid = (m+n)/2d;
        int midi = (int)mid;
        boolean flag = false;
        if(mid - midi == 0) {
            flag = true;
        }
        if(flag) {
            d = ( temp[midi-1] + temp[midi] )/2d;
        }else {
            d = temp[midi];
        }
        return d;
    }

}
