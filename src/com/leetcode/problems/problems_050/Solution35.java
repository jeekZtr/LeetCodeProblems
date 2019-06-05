package com.leetcode.problems.problems_050;

import java.util.Arrays;

public class Solution35 {

    public static void main(String[] args) {
              int[] arr = {3,6,7,8,10};
              //  int[] arr = {1,3,5,6};
        //         mergeSort(arr,0,arr.length-1);
        //       quickSort(arr,0,arr.length-1);
       
           
           System.out.println( searchInsert(arr,4) );
    }
    /**
     * 
     *  给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

                        你可以假设数组中无重复元素。
                        
                        示例 1:
                        
                        输入: [1,3,5,6], 5
                        输出: 2
                        示例 2:
                        
                        输入: [1,3,5,6], 2
                        输出: 1
                        示例 3:
                        
                        输入: [1,3,5,6], 7
                        输出: 4
                        示例 4:
                        
                        输入: [1,3,5,6], 0
                        输出: 0
     * 
    * @author zhngtr-mi
    * @since 2019-06-05
     */
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int mid = 0 ;
        while(l<=h) {
            mid = l+((h-l)>>2);
           
            if( target < nums[mid] ) {
                if(mid-1>= l && nums[mid-1] < target ) {
                    break;
                }
                h =  mid-1;
            }else if(target > nums[mid] ){
                if(mid == nums.length-1) {
                    return mid+1;
                }else 
                if(mid+1<= h && nums[mid+1]>target ) {
                    mid++;
                    break;
                }
                l = mid+1;
            }else if(nums[mid] == target){
                break;
            }
        }
        
        return mid;
    }
}

	