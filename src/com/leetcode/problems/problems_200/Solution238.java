package com.leetcode.problems.problems_200;

import java.util.Arrays;

/**
 * 
 除自身以外数组的乘积*
 
     给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
    
    示例:
    
    输入: [1,2,3,4]
    输出: [24,12,8,6]
    说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
    
    进阶：
    你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
     
* @author zhngtr-mi
 */
public class Solution238 {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        //int arr[] = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString( productExceptSelf(arr)));
        
    }
    
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int[] r = new int[len];
        int[] l = new int[len];
        int x = nums[0]; int y = nums[len-1];
        r[0] = x; l[len-1] = y;
        for(int i=1;i<len;++i) {
              x *=  nums[i];    
              y *= nums[len-i-1];
              r[i] = x;
              l[len-i-1] = y;
        }
        res[0] = l[1];
        for(int i=1;i<len-1;i++) {
            res[i] = r[i-1]*l[i+1];
        }
        res[len-1] = r[len-2]; 
        return res;
    }
    
}

	